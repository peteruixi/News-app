package com.news.app.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class News implements Serializable {
    @ApiModelProperty(value = "新闻ID")
    private Integer newsId;

    @ApiModelProperty(value = "新闻文章题目")
    private String newsTitle;

    @ApiModelProperty(value = "新闻文章发表人")
    private String newsUserdm;

    @ApiModelProperty(value = "新闻文章发表日期")
    private Date newsPubDate;

    @ApiModelProperty(value = "新闻阅读人数")
    private Integer newsRead;

    @ApiModelProperty(value = "新闻更新日期")
    private Date newsUpdateDate;

    @ApiModelProperty(value = "新闻所属栏目ID")
    private Integer newsColumndm;

    @ApiModelProperty(value = "新闻点赞数")
    private Integer likes;

    @ApiModelProperty(value = "新闻详细信息")
    private String newsDetails;

    private static final long serialVersionUID = 1L;

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNewsUserdm() {
        return newsUserdm;
    }

    public void setNewsUserdm(String newsUserdm) {
        this.newsUserdm = newsUserdm;
    }

    public Date getNewsPubDate() {
        return newsPubDate;
    }

    public void setNewsPubDate(Date newsPubDate) {
        this.newsPubDate = newsPubDate;
    }

    public Integer getNewsRead() {
        return newsRead;
    }

    public void setNewsRead(Integer newsRead) {
        this.newsRead = newsRead;
    }

    public Date getNewsUpdateDate() {
        return newsUpdateDate;
    }

    public void setNewsUpdateDate(Date newsUpdateDate) {
        this.newsUpdateDate = newsUpdateDate;
    }

    public Integer getNewsColumndm() {
        return newsColumndm;
    }

    public void setNewsColumndm(Integer newsColumndm) {
        this.newsColumndm = newsColumndm;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public String getNewsDetails() {
        return newsDetails;
    }

    public void setNewsDetails(String newsDetails) {
        this.newsDetails = newsDetails;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", newsId=").append(newsId);
        sb.append(", newsTitle=").append(newsTitle);
        sb.append(", newsUserdm=").append(newsUserdm);
        sb.append(", newsPubDate=").append(newsPubDate);
        sb.append(", newsRead=").append(newsRead);
        sb.append(", newsUpdateDate=").append(newsUpdateDate);
        sb.append(", newsColumndm=").append(newsColumndm);
        sb.append(", likes=").append(likes);
        sb.append(", newsDetails=").append(newsDetails);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}