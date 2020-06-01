package com.news.app.controller;

import com.news.app.common.api.CommonPage;
import com.news.app.common.api.CommonResult;
import com.news.app.nosql.elasticsearch.document.EsNews;
import com.news.app.service.EsNewsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * 搜索新闻管理Controller
 *
 */
@Controller
@Api(tags = "EsNewsController", description = "搜索新闻管理")
@RequestMapping("/esProduct")
public class EsNewsController {
    @Autowired
    private EsNewsService esNewsService;
    protected static final Logger logger = LoggerFactory.getLogger(EsNewsController.class);

    @ApiOperation(value = "导入所有数据库中新闻到ES")
    @RequestMapping(value = "/importAll", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Integer> importAllList() {
        logger.info("news news news news");
        int count = esNewsService.importAll();
        logger.info("count count count",count);
        return CommonResult.success(count);
    }

    @ApiOperation(value = "根据id删除")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<Object> delete(@PathVariable Long id) {
        esNewsService.delete(id);
        return CommonResult.success(null);
    }

    @ApiOperation(value = "根据id批量删除")
    @RequestMapping(value = "/delete/batch", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Object> delete(@RequestParam("ids") List<Long> ids) {
        esNewsService.delete(ids);
        return CommonResult.success(null);
    }

    @ApiOperation(value = "根据id创建商品")
    @RequestMapping(value = "/create/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<EsNews> create(@PathVariable Long id) {
        EsNews esProduct = esNewsService.create(id);
        if (esProduct != null) {
            return CommonResult.success(esProduct);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation(value = "简单搜索")
    @RequestMapping(value = "/search/simple", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<EsNews>> search(@RequestParam(required = false) String keyword,
                                                      @RequestParam(required = false, defaultValue = "0") Integer pageNum,
                                                      @RequestParam(required = false, defaultValue = "5") Integer pageSize)
    {
        Page<EsNews> esNewsPage = esNewsService.search(keyword, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(esNewsPage));
    }

    /*@ApiOperation(value = "关键词搜索")
    @RequestMapping(value = "/search/ByKeyword", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<EsNews>> searchByKeywords(@RequestParam(required = true)String keywords,@RequestParam(required = false, defaultValue = "0") Integer pageNum,
                                                   @RequestParam(required = false, defaultValue = "5") Integer pageSize)
    {
        Page<EsNews> esNewsPage = esNewsService.searchByKeywords(keywords, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(esNewsPage));
    }*/

}
