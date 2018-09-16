package com.drcsy.am.dto;

import java.util.Date;

public class GMember {
    private String id;

    private String doctor_group_id;

    private String doctor_id;

    private Double cons_weight;

    private String status;

    private String status_desc;

    private Date modify_date;

    private Date create_date;

    private String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDoctor_group_id() {
        return doctor_group_id;
    }

    public void setDoctor_group_id(String doctor_group_id) {
        this.doctor_group_id = doctor_group_id == null ? null : doctor_group_id.trim();
    }

    public String getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(String doctor_id) {
        this.doctor_id = doctor_id == null ? null : doctor_id.trim();
    }

    public Double getCons_weight() {
        return cons_weight;
    }

    public void setCons_weight(Double cons_weight) {
        this.cons_weight = cons_weight;
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
}