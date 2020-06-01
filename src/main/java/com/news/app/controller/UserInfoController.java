package com.news.app.controller;

import com.news.app.mbg.mapper.UserinfoMapper;
import com.news.app.mbg.model.News;
import com.news.app.mbg.model.Userinfo;
import com.news.app.mbg.model.UserinfoExample;
import com.news.app.common.api.CommonPage;
import com.news.app.common.api.CommonResult;
import com.news.app.service.UserinfoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
* 用户信息管理控制器
* created by Petardation May/27/2020
 */

@Api(tags = "UserInfoController", description = "用户信息管理")
@Controller
@RequestMapping("/userinfo")
public class UserInfoController {
    @Autowired
    private UserinfoService userinfoService;

    private static final Logger LOGGER = LoggerFactory.getLogger(NewsController.class);

    @ApiOperation("更新指定用户id的用户详情")
    @RequestMapping(value = "/update/{userinfo_id}",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Userinfo> updateUserinfo(@PathVariable("userinfo_id") String id, @RequestBody Userinfo userinfodto, BindingResult result){
        CommonResult commonResult;
        int count = userinfoService.updateUserinfo(id, userinfodto);
        if (count == 1) {
            commonResult = CommonResult.success(userinfodto);
            LOGGER.debug("updateBrand success:{}", userinfodto);
        } else {
            commonResult = CommonResult.failed("操作失败");
            LOGGER.debug("updateBrand failed:{}", userinfodto);
        }
        return commonResult;

    }

    @ApiOperation("获取指定用户id的用户详情")
    @RequestMapping(value = "/{user_id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<Userinfo>> userinfo(@PathVariable("user_id") String id) {

        return CommonResult.success(userinfoService.getUserinfo(id));



    }

}

