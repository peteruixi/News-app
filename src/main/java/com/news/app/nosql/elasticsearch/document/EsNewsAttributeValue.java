package com.news.app.nosql.elasticsearch.document;

import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import java.io.Serializable;

/**
 * 搜索中的商品属性信息
 */

public class EsNewsAttributeValue implements Serializable{
    private static final long serialVersionUID =1L;
    private String id;
    private String productAttributeId;
    @Field(type = FieldType.Keyword)
    private String value;

    private Integer type;

    @Field(type=FieldType.Keyword)
    private String name;

    public String getId() { return id;}

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductAttributeId() {
        return productAttributeId;
    }

    public void setProductAttributeId(String productAttributeId) {
        this.productAttributeId = productAttributeId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
