package com.news.app.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Userinfo implements Serializable {
    @ApiModelProperty(value = "用户信息id")
    private Integer userinfoId;

    @ApiModelProperty(value = "用户信息名字")
    private String userinfoName;

    @ApiModelProperty(value = "用户信息性别")
    private String userinfoSex;

    @ApiModelProperty(value = "用户信息生日")
    private Date userinfoBirthday;

    @ApiModelProperty(value = "用户信息电话")
    private String userinfoPhone;

    @ApiModelProperty(value = "用户信息邮箱")
    private String userinfoEmail;

    @ApiModelProperty(value = "用户信息描述")
    private String userinfoDesc;

    @ApiModelProperty(value = "用户id")
    private String useridDm;

    private static final long serialVersionUID = 1L;

    public Integer getUserinfoId() {
        return userinfoId;
    }

    public void setUserinfoId(Integer userinfoId) {
        this.userinfoId = userinfoId;
    }

    public String getUserinfoName() {
        return userinfoName;
    }

    public void setUserinfoName(String userinfoName) {
        this.userinfoName = userinfoName;
    }

    public String getUserinfoSex() {
        return userinfoSex;
    }

    public void setUserinfoSex(String userinfoSex) {
        this.userinfoSex = userinfoSex;
    }

    public Date getUserinfoBirthday() {
        return userinfoBirthday;
    }

    public void setUserinfoBirthday(Date userinfoBirthday) {
        this.userinfoBirthday = userinfoBirthday;
    }

    public String getUserinfoPhone() {
        return userinfoPhone;
    }

    public void setUserinfoPhone(String userinfoPhone) {
        this.userinfoPhone = userinfoPhone;
    }

    public String getUserinfoEmail() {
        return userinfoEmail;
    }

    public void setUserinfoEmail(String userinfoEmail) {
        this.userinfoEmail = userinfoEmail;
    }

    public String getUserinfoDesc() {
        return userinfoDesc;
    }

    public void setUserinfoDesc(String userinfoDesc) {
        this.userinfoDesc = userinfoDesc;
    }

    public String getUseridDm() {
        return useridDm;
    }

    public void setUseridDm(String useridDm) {
        this.useridDm = useridDm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userinfoId=").append(userinfoId);
        sb.append(", userinfoName=").append(userinfoName);
        sb.append(", userinfoSex=").append(userinfoSex);
        sb.append(", userinfoBirthday=").append(userinfoBirthday);
        sb.append(", userinfoPhone=").append(userinfoPhone);
        sb.append(", userinfoEmail=").append(userinfoEmail);
        sb.append(", userinfoDesc=").append(userinfoDesc);
        sb.append(", useridDm=").append(useridDm);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}