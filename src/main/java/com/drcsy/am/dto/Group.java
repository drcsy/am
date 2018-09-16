package com.drcsy.am.dto;

import java.util.Date;

public class Group {
    private String id;

    private String group_name;

    private String group_members;

    private String doctor_id;

    private String status;

    private String status_desc;

    private String account;

    private Double cost;

    private String group_info;

    private Date modify_date;

    private Date create_date;

    private String remark;

    private String name_quanpin;

    private String name_first_pinyin;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name == null ? null : group_name.trim();
    }

    public String getGroup_members() {
        return group_members;
    }

    public void setGroup_members(String group_members) {
        this.group_members = group_members == null ? null : group_members.trim();
    }

    public String getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(String doctor_id) {
        this.doctor_id = doctor_id == null ? null : doctor_id.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getStatus_desc() {
        return status_desc;
    }

    public void setStatus_desc(String status_desc) {
        this.status_desc = status_desc == null ? null : status_desc.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getGroup_info() {
        return group_info;
    }

    public void setGroup_info(String group_info) {
        this.group_info = group_info == null ? null : group_info.trim();
    }

    public Date getModify_date() {
        return modify_date;
    }

    public void setModify_date(Date modify_date) {
        this.modify_date = modify_date;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getName_quanpin() {
        return name_quanpin;
    }

    public void setName_quanpin(String name_quanpin) {
        this.name_quanpin = name_quanpin == null ? null : name_quanpin.trim();
    }

    public String getName_first_pinyin() {
        return name_first_pinyin;
    }

    public void setName_first_pinyin(String name_first_pinyin) {
        this.name_first_pinyin = name_first_pinyin == null ? null : name_first_pinyin.trim();
    }
}