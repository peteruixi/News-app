package com.news.app.controller;

import com.news.app.mbg.mapper.LikesMapper;
import com.news.app.mbg.model.Likes;
import com.news.app.mbg.model.LikesExample;

import com.news.app.common.api.CommonPage;
import com.news.app.common.api.CommonResult;
import com.news.app.mbg.model.News;
import com.news.app.service.LikesService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Likes Controller
 * Created by petardation
 */
@Api(tags = "LikesController", description = "点赞管理")
@Controller
@RequestMapping("/likes")
public class LikesController {
    @Autowired
    private LikesService likesService;

    private static final Logger LOGGER = LoggerFactory.getLogger(NewsController.class);

    @ApiOperation("点赞新闻")
    @RequestMapping(value = "like/{news_id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult NewsLike (@PathVariable("news_id") int id,@RequestParam int user_id ){
        CommonResult commonResult;
        int count = likesService.like(id, user_id);
        if (count == 1) {
            commonResult = CommonResult.success("操作成功");
            LOGGER.debug("like success:{}", user_id );
        } else {
            commonResult = CommonResult.failed("操作失败");
            LOGGER.debug("like failed:{}", user_id);
        }
        return commonResult;

    }

    @ApiOperation("取消点赞")
    @RequestMapping(value = "unlike/{news_id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult NewsUnlike(@PathVariable("news_id") int id, @RequestParam int user_id){
        CommonResult commonResult;
        int count = likesService.unlike(id,user_id);
        if (count == 1) {
            commonResult = CommonResult.success("操作成功");
            LOGGER.debug("unlike success:{}",user_id);
        } else {
            commonResult = CommonResult.failed("操作失败");
            LOGGER.debug("unlike failed:{}", user_id);
        }
        return commonResult;
    }
}
