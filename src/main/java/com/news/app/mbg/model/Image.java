package com.news.app.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Image implements Serializable {
    @ApiModelProperty(value = "图片id")
    private String imgId;

    @ApiModelProperty(value = "图片名称")
    private String imgName;

    @ApiModelProperty(value = "图片展示名称")
    private String imgDisplayName;

    @ApiModelProperty(value = "图片相对路径")
    private String imgRelative;

    @ApiModelProperty(value = "图片绝对路径")
    private String imgAbsolute;

    @ApiModelProperty(value = "所属新闻")
    private String imgNewsdm;

    @ApiModelProperty(value = "所属栏目")
    private Integer imgColumndm;

    private static final long serialVersionUID = 1L;

    public String getImgId() {
        return imgId;
    }

    public void setImgId(String imgId) {
        this.imgId = imgId;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public String getImgDisplayName() {
        return imgDisplayName;
    }

    public void setImgDisplayName(String imgDisplayName) {
        this.imgDisplayName = imgDisplayName;
    }

    public String getImgRelative() {
        return imgRelative;
    }

    public void setImgRelative(String imgRelative) {
        this.imgRelative = imgRelative;
    }

    public String getImgAbsolute() {
        return imgAbsolute;
    }

    public void setImgAbsolute(String imgAbsolute) {
        this.imgAbsolute = imgAbsolute;
    }

    public String getImgNewsdm() {
        return imgNewsdm;
    }

    public void setImgNewsdm(String imgNewsdm) {
        this.imgNewsdm = imgNewsdm;
    }

    public Integer getImgColumndm() {
        return imgColumndm;
    }

    public void setImgColumndm(Integer imgColumndm) {
        this.imgColumndm = imgColumndm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", imgId=").append(imgId);
        sb.append(", imgName=").append(imgName);
        sb.append(", imgDisplayName=").append(imgDisplayName);
        sb.append(", imgRelative=").append(imgRelative);
        sb.append(", imgAbsolute=").append(imgAbsolute);
        sb.append(", imgNewsdm=").append(imgNewsdm);
        sb.append(", imgColumndm=").append(imgColumndm);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}