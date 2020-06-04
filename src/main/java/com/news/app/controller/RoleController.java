package com.news.app.controller;

import com.news.app.common.api.CommonResult;
import com.news.app.dto.AdminLoginParam;
import com.news.app.mbg.mapper.RoleMapper;
import com.news.app.mbg.model.News;
import com.news.app.mbg.model.Role;
import com.news.app.mbg.model.RoleExample;

import com.news.app.service.RoleService;


import com.news.app.service.AdminService;
import com.news.app.service.impl.AdminServiceImpl;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.*;

/**
 * 用户角色管理
 * Create by petardation on 2020 6/30
 */
@Controller
@Api(tags = "RoleController", description = "用户角色管理")
@RequestMapping("/role")
public class RoleController {
    private static final Logger LOGGER = LoggerFactory.getLogger(AdminServiceImpl.class);

    @Autowired
    private RoleService roleService;


    @ApiOperation("获取所有角色列表")
    @RequestMapping(value = "listAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<Role>> getRoleList() {
        return CommonResult.success(roleService.listAllRole());
    }

    @ApiOperation("创建角色")
    @RequestMapping(value ="role/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult createRole(@RequestParam String functionID, @RequestBody Role role){
        CommonResult commonResult;
        List <Integer> functionIDs = new ArrayList<Integer>();
        StringTokenizer tkn = new StringTokenizer(functionID," ");
        while(tkn.hasMoreTokens()){
            functionIDs.add(Integer.valueOf(tkn.nextToken()));

        }
        int count = roleService.createRole(functionIDs, role);
        if (count ==1 ){
            commonResult = CommonResult.success(role);
            LOGGER.debug("createArticle success:{}", role);
        } else {
            commonResult = CommonResult.failed("操作失败");
            LOGGER.debug("createArticle failed:{}", role);
        }
        return commonResult;

    }

}
