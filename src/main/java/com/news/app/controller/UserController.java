package com.news.app.controller;

import com.news.app.common.api.CommonResult;
import com.news.app.mbg.model.User;
import com.news.app.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Date;


/**
* 会员登录注册管理Controller
 * Created by macro on 2018/8/3.
 */
@Controller
@Api(tags = "UserController", description = "会员登录注册管理")
@RequestMapping("/sso")
public class UserController {
    @Autowired
    private UserService userService;

    private static final Logger LOGGER = LoggerFactory.getLogger(NewsController.class);

    @ApiOperation("获取验证码")
    @RequestMapping(value = "/getAuthCode", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getAuthCode(@RequestParam String telephone) {
        return userService.generateAuthCode(telephone);
    }

    @ApiOperation("判断验证码是否正确")
    @RequestMapping(value = "/verifyAuthCode", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updatePassword(@RequestParam String telephone,
                                       @RequestParam String authCode) {
        return userService.verifyAuthCode(telephone,authCode);
    }

    @ApiOperation("注册新的用户")
    @RequestMapping(value = "/register", method=RequestMethod.POST)
    @ResponseBody
    public CommonResult register(@RequestBody User user){
        CommonResult commonResult;
        //User user = new User();
        int count = userService.registerUser(user);
        if (count == 1){
            commonResult = CommonResult.success(user);
            LOGGER.debug("User Registration success:{}",user);
        }
        else{
            commonResult = CommonResult.failed("操作失败");
            LOGGER.debug("User Registration failed:{}",user);
        }
        return commonResult;

    }


}
