package com.news.app.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Likes implements Serializable {
    @ApiModelProperty(value = "点赞记录id")
    private Integer likeId;

    @ApiModelProperty(value = "点赞新闻")
    private String likeNewsdm;

    @ApiModelProperty(value = "点赞用户")
    private String likeUserdm;

    private static final long serialVersionUID = 1L;

    public Integer getLikeId() {
        return likeId;
    }

    public void setLikeId(Integer likeId) {
        this.likeId = likeId;
    }

    public String getLikeNewsdm() {
        return likeNewsdm;
    }

    public void setLikeNewsdm(String likeNewsdm) {
        this.likeNewsdm = likeNewsdm;
    }

    public String getLikeUserdm() {
        return likeUserdm;
    }

    public void setLikeUserdm(String likeUserdm) {
        this.likeUserdm = likeUserdm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", likeId=").append(likeId);
        sb.append(", likeNewsdm=").append(likeNewsdm);
        sb.append(", likeUserdm=").append(likeUserdm);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}