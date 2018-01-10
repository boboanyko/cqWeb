package com.cq.model;

import java.math.BigDecimal;
import java.util.Date;

public class CqPrd {
    private String id;

    private String groupId;

    private String prdName;

    private String prdType;

    private BigDecimal prdPrice;

    private String prdRate;

    private String prdDesc;

    private String prdHeadPicPath;

    private Date createDate;

    private String createUser;

    private Date modifyDate;

    private String modfyUser;

    private String delFlag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    public String getPrdName() {
        return prdName;
    }

    public void setPrdName(String prdName) {
        this.prdName = prdName == null ? null : prdName.trim();
    }

    public String getPrdType() {
        return prdType;
    }

    public void setPrdType(String prdType) {
        this.prdType = prdType == null ? null : prdType.trim();
    }

    public BigDecimal getPrdPrice() {
        return prdPrice;
    }

    public void setPrdPrice(BigDecimal prdPrice) {
        this.prdPrice = prdPrice;
    }

    public String getPrdRate() {
        return prdRate;
    }

    public void setPrdRate(String prdRate) {
        this.prdRate = prdRate == null ? null : prdRate.trim();
    }

    public String getPrdDesc() {
        return prdDesc;
    }

    public void setPrdDesc(String prdDesc) {
        this.prdDesc = prdDesc == null ? null : prdDesc.trim();
    }

    public String getPrdHeadPicPath() {
        return prdHeadPicPath;
    }

    public void setPrdHeadPicPath(String prdHeadPicPath) {
        this.prdHeadPicPath = prdHeadPicPath == null ? null : prdHeadPicPath.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getModfyUser() {
        return modfyUser;
    }

    public void setModfyUser(String modfyUser) {
        this.modfyUser = modfyUser == null ? null : modfyUser.trim();
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }
}