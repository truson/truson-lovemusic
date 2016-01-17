package com.truson.lovemusic.practice.entity;

import java.util.Date;

/**
 * 基本实体类
 * 这里用XXXEntity来表示数据库表的映射对象
 * Created by lezi on 2015/12/24.
 */
public class BaseEntity {

    private Long id;          //主键Id
    private String remarks;     //备注
    private String creator;     //创建人
    private Date createDate;    //创建时间
    private String updator;     //更新人
    private Date updateDate;    //更新时间
    private String delFlag;     //删除标记

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }
}
