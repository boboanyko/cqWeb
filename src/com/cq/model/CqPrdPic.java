package com.cq.model;

import java.util.Date;

public class CqPrdPic {
    private String id;

    private String prdId;

    private String groupId;

    private String prdPicPath;

    private Date createDate;

    private String createUsr;

    private String delFlag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPrdId() {
        return prdId;
    }

    public void setPrdId(String prdId) {
        this.prdId = prdId == null ? null : prdId.trim();
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    public String getPrdPicPath() {
        return prdPicPath;
    }

    public void setPrdPicPath(String prdPicPath) {
        this.prdPicPath = prdPicPath == null ? null : prdPicPath.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateUsr() {
        return createUsr;
    }

    public void setCreateUsr(String createUsr) {
        this.createUsr = createUsr == null ? null : createUsr.trim();
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }
}