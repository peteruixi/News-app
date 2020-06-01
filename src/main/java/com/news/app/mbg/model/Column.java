package com.news.app.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Column implements Serializable {
    @ApiModelProperty(value = "专栏id")
    private Integer columnId;

    @ApiModelProperty(value = "专栏名称")
    private String columnName;

    @ApiModelProperty(value = "栏目父id")
    private Integer columnFid;

    @ApiModelProperty(value = "专栏描述")
    private String columnDesc;

    @ApiModelProperty(value = "专栏更新时间戳")
    private Date columnUpdateDate;

    private static final long serialVersionUID = 1L;

    public Integer getColumnId() {
        return columnId;
    }

    public void setColumnId(Integer columnId) {
        this.columnId = columnId;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public Integer getColumnFid() {
        return columnFid;
    }

    public void setColumnFid(Integer columnFid) {
        this.columnFid = columnFid;
    }

    public String getColumnDesc() {
        return columnDesc;
    }

    public void setColumnDesc(String columnDesc) {
        this.columnDesc = columnDesc;
    }

    public Date getColumnUpdateDate() {
        return columnUpdateDate;
    }

    public void setColumnUpdateDate(Date columnUpdateDate) {
        this.columnUpdateDate = columnUpdateDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", columnId=").append(columnId);
        sb.append(", columnName=").append(columnName);
        sb.append(", columnFid=").append(columnFid);
        sb.append(", columnDesc=").append(columnDesc);
        sb.append(", columnUpdateDate=").append(columnUpdateDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}