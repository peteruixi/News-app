
package com.news.app.nosql.elasticsearch.document;


import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;
import java.util.Date;

/**
 * 搜索中的商品信息
 * Created by macro on 2018/6/19.
 */
@Document(indexName = "esn", type = "EsNews",shards = 1,replicas = 0)
public class EsNews implements Serializable {
    private static final long serialVersionUID = -1L;

    /*
        n.news_id id
        n.news_title title
        n.news_userdm userdm
        n.news_pub_date pub_date
        n.news_details details
        n.news_read read
        n.news_update_date update_date
        i.img_id pic_id
        i.img_name pic_name
        i.img_display_name disp_name
     */


    @Id
    private String id;
    @Field(type = FieldType.Keyword)
    private String title;
    @Field(type = FieldType.Keyword)
    private String userdm;
    private Date pub_date;
    //@Field(analyzer = "ik_max_word",type = FieldType.Text)
    private String details;
    private int nread;
    private Date update_date;
    private String pic_id;
    private String pic_name;
    private String disp_name;




    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserdm() {
        return userdm;
    }

    public void setUserdm(String userdm) {
        this.userdm = userdm;
    }

    public Date getPub_date() {
        return pub_date;
    }

    public void setPub_date(Date pub_date) {
        this.pub_date = pub_date;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getNread() {
        return nread;
    }

    public void setNread(int read) {
        this.nread = read;
    }

    public Date getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(Date update_date) {
        this.update_date = update_date;
    }

    public String getPic_id() {
        return pic_id;
    }

    public void setPic_id(String pic_id) {
        this.pic_id = pic_id;
    }

    public String getPic_name() {
        return pic_name;
    }

    public void setPic_name(String pic_name) {
        this.pic_name = pic_name;
    }

    public String getDisp_name() {
        return disp_name;
    }

    public void setDisp_name(String disp_name) {
        this.disp_name = disp_name;
    }



}
