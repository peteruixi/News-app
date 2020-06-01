package com.news.app.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Function implements Serializable {
    @ApiModelProperty(value = "模块id")
    private Integer functionId;

    @ApiModelProperty(value = "模块名称")
    private String functionName;

    @ApiModelProperty(value = "模块url")
    private String functionUri;

    private String functionDesc;

    @ApiModelProperty(value = "模块修改时间")
    private Date functionModDate;

    @ApiModelProperty(value = "/*模块是否开启*/")
    private Integer status;

    private static final long serialVersionUID = 1L;

    public Integer getFunctionId() {
        return functionId;
    }

    public void setFunctionId(Integer functionId) {
        this.functionId = functionId;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public String getFunctionUri() {
        return functionUri;
    }

    public void setFunctionUri(String functionUri) {
        this.functionUri = functionUri;
    }

    public String getFunctionDesc() {
        return functionDesc;
    }

    public void setFunctionDesc(String functionDesc) {
        this.functionDesc = functionDesc;
    }

    public Date getFunctionModDate() {
        return functionModDate;
    }

    public void setFunctionModDate(Date functionModDate) {
        this.functionModDate = functionModDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", functionId=").append(functionId);
        sb.append(", functionName=").append(functionName);
        sb.append(", functionUri=").append(functionUri);
        sb.append(", functionDesc=").append(functionDesc);
        sb.append(", functionModDate=").append(functionModDate);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}