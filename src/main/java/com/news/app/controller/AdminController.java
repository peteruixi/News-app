package com.news.app.controller;

import com.news.app.common.api.CommonResult;
import com.news.app.dto.AdminLoginParam;
import com.news.app.mbg.model.Admin;
import com.news.app.mbg.model.Permit;
import com.news.app.mbg.model.Function;
import com.news.app.service.AdminService;
import com.news.app.service.impl.AdminServiceImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 后台用户管理
 * Create by petardation on 2020 5/29
 */
@Controller
@Api(tags = "AdminController", description = "后台用户管理")
@RequestMapping("/admin")
public class AdminController {
    private static final Logger LOGGER = LoggerFactory.getLogger(AdminServiceImpl.class);
    @Autowired
    private AdminService adminService;
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @ApiOperation(value = "用户注册")
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Admin> register(@RequestBody Admin adminParam, BindingResult result) {
        Admin admin = adminService.register(adminParam);
        if (admin == null) {
            CommonResult.failed();

        }
        return CommonResult.success(admin);
    }

    @ApiOperation(value = "登录以后返回token")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult login(@RequestBody AdminLoginParam adminLoginParam, BindingResult result) {
        LOGGER.info("before service call ");
        String token = adminService.login(adminLoginParam.getUsername(), adminLoginParam.getPassword());
        LOGGER.info(token);
        if(token == null) {
            return CommonResult.validateFailed("用户名或密码错误");
        }
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token",token);
        tokenMap.put("tokenHead",tokenHead);
        return CommonResult.success(tokenMap);
    }

    @ApiOperation("获取管理员所有权限（包括+-权限）")
    @RequestMapping(value = "/permit/{adminId}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<Function>> getPermitList(@PathVariable String adminId) {
        List<Function> permitList = adminService.getPermitList(adminId);
        return CommonResult.success(permitList);
    }

    @ApiOperation("添加管理员角色")
    @RequestMapping(value = "/role/grant/{adminId}",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult grantRole(@PathVariable String adminId, @RequestParam int roleId){
        int count = adminService.grantRole(adminId, roleId);
        if (count == 1){
            LOGGER.debug("grant role success :id={}", adminId);
            return CommonResult.success(null);
        } else {
            LOGGER.debug("grant role failed :id={}", adminId);
            return CommonResult.failed("操作失败");
        }
    }

    @ApiOperation("移除管理员角色")
    @RequestMapping(value = "/role/dismiss/{adminId}",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult dismissRole(@PathVariable String adminId, @RequestParam int roleId){
        int count = adminService.dismissRole(adminId, roleId);
        if (count == 1){
            LOGGER.debug("dismiss role success :id={}", adminId);
            return CommonResult.success(null);
        } else {
            LOGGER.debug("dismiss role failed :id={}", adminId);
            return CommonResult.failed("操作失败");
        }

    }


}




