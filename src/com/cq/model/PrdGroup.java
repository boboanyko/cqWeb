package com.cq.model;

import java.util.Date;

public class PrdGroup {
    private String id;

    private String groupName;

    private String groupNameEn;

    private String groupIconName;

    private String groupPicPath;

    private Date createDate;

    private String createUser;

    private Date modifyDate;

    private String modfyUser;

    private String delFlag;

    private String groupCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public String getGroupNameEn() {
        return groupNameEn;
    }

    public void setGroupNameEn(String groupNameEn) {
        this.groupNameEn = groupNameEn == null ? null : groupNameEn.trim();
    }

    public String getGroupIconName() {
        return groupIconName;
    }

    public void setGroupIconName(String groupIconName) {
        this.groupIconName = groupIconName == null ? null : groupIconName.trim();
    }

    public String getGroupPicPath() {
        return groupPicPath;
    }

    public void setGroupPicPath(String groupPicPath) {
        this.groupPicPath = groupPicPath == null ? null : groupPicPath.trim();
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

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode == null ? null : groupCode.trim();
    }

	@Override
	public String toString() {
		return "PrdGroup [id=" + id + ", groupName=" + groupName + ", groupNameEn=" + groupNameEn + ", groupIconName="
				+ groupIconName + ", groupPicPath=" + groupPicPath + ", createDate=" + createDate + ", createUser="
				+ createUser + ", modifyDate=" + modifyDate + ", modfyUser=" + modfyUser + ", delFlag=" + delFlag
				+ ", groupCode=" + groupCode + "]";
	}
    
    
}