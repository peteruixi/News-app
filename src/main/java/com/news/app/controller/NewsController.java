package com.news.app.controller;

import com.news.app.mbg.mapper.NewsMapper;
import com.news.app.mbg.model.News;
import com.news.app.mbg.model.NewsExample;
import com.news.app.common.api.CommonPage;
import com.news.app.common.api.CommonResult;
import com.news.app.service.NewsService;

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
 * 新闻Controller
 * Created by petardation on 2020/5/18.
 */
@Api(tags = "NewsController", description = "新闻文章管理")
@Controller
@RequestMapping("/news")
public class NewsController {
    @Autowired
    private NewsService demoService;

    private static final Logger LOGGER = LoggerFactory.getLogger(NewsController.class);

    @ApiOperation("获取所有新闻列表")
    @RequestMapping(value = "listAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<News>> getArticleList() {
        return CommonResult.success(demoService.listAllArticle());
    }

    @ApiOperation("添加新闻")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult createArticle(@RequestBody News news) {
        CommonResult commonResult;
        int count = demoService.createArticle(news);
        if (count == 1) {
            commonResult = CommonResult.success(news);
            LOGGER.debug("createArticle success:{}", news);
        } else {
            commonResult = CommonResult.failed("操作失败");
            LOGGER.debug("createArticle failed:{}", news);
        }
        return commonResult;
    }

    @ApiOperation("更新指定id新闻信息")
    @RequestMapping(value = "/update/{news_id}", method = RequestMethod.POST)
    @ResponseBody
    @PreAuthorize("hasAuthority('news:update')")
    public CommonResult updateArticle(@PathVariable("news_id") int id, @RequestBody News newsdto, BindingResult result) {
        CommonResult commonResult;
        int count = demoService.updateArticle(id, newsdto);
        if (count == 1) {
            commonResult = CommonResult.success(newsdto);
            LOGGER.debug("updateBrand success:{}", newsdto);
        } else {
            commonResult = CommonResult.failed("操作失败");
            LOGGER.debug("updateBrand failed:{}", newsdto);
        }
        return commonResult;
    }

    @ApiOperation("删除指定id的新闻")
    @RequestMapping(value = "/delete/{news_id}", method = RequestMethod.GET)
    @ResponseBody
    @PreAuthorize("hasAuthority('news:delete')")
    public CommonResult deleteArticle(@PathVariable("news_id") int id) {
        int count = demoService.deleteArticle(id);
        if (count == 1) {
            LOGGER.debug("deleteArticle success :id={}", id);
            return CommonResult.success(null);
        } else {
            LOGGER.debug("deleteArticle failed :id={}", id);
            return CommonResult.failed("操作失败");
        }
    }

    @ApiOperation("分页查询新闻列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<News>> listNews(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                        @RequestParam(value = "pageSize", defaultValue = "3") Integer pageSize) {
        List<News> brandList = demoService.listArticle(pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(brandList));
    }

    @ApiOperation("获取指定id的新闻详情")
    @RequestMapping(value = "/{news_id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<News> news(@PathVariable("news_id") int id) {
        return CommonResult.success(demoService.getArticle(id));
    }


    @ApiOperation("更新新闻阅读量")
    @RequestMapping(value="/read/{news_id}", method = RequestMethod.POST)
    @ResponseBody
    @PreAuthorize("hasAuthority('news:create')")
    public CommonResult increment(@PathVariable("news_id") int id,@RequestBody int read, News newsdto){
        CommonResult commonResult;
        int flag = demoService.incrementRead(id,read,newsdto);
        if(flag==1){
            commonResult = CommonResult.success(newsdto);
            LOGGER.debug("updateBrand success:{}", newsdto);
        }else{
            commonResult = CommonResult.failed("操作失败");
            LOGGER.debug("updateBrand failed:{}", newsdto);
        }
        return commonResult;
    }

    /*@ApiOperation("获取指定id的新闻详情")
    @RequestMapping(value="/{news_id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<News>> getNewsList() {

        return CommonResult.success(demoService.listAllArticle());
    }*/
}
