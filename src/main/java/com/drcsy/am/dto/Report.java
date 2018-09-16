package com.drcsy.am.dto;

import java.util.Date;

public class Report {
    private String id;

    private String patient_record_id;

    private String patient_id;

    private String doctor_id;

    private String audit_doctor_id;

    private String doctor_group_id;

    private String image_see;

    private String status;

    private String status_desc;

    private String diagnostic_opinion;

    private String report_info;

    private Date modify_date;

    private Date create_date;

    private String remark;

    private String qrcode;

    private String check_type;

    private Double image_see_fee;

    private Integer modify_count;

    private String check_point;

    private Integer check_point_number;

    private Integer apply_read_report_info;

    private Integer operate_read_report_info;

    private Integer apply_read_modify_image;

    private Integer operate_read_modify_image;

    private String imageSee_status;

    private String audit_opinion;

    private String audit_state;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPatient_record_id() {
        return patient_record_id;
    }

    public void setPatient_record_id(String patient_record_id) {
        this.patient_record_id = patient_record_id == null ? null : patient_record_id.trim();
    }

    public String getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(String patient_id) {
        this.patient_id = patient_id == null ? null : patient_id.trim();
    }

    public String getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(String doctor_id) {
        this.doctor_id = doctor_id == null ? null : doctor_id.trim();
    }

    public String getAudit_doctor_id() {
        return audit_doctor_id;
    }

    public void setAudit_doctor_id(String audit_doctor_id) {
        this.audit_doctor_id = audit_doctor_id == null ? null : audit_doctor_id.trim();
    }

    public String getDoctor_group_id() {
        return doctor_group_id;
    }

    public void setDoctor_group_id(String doctor_group_id) {
        this.doctor_group_id = doctor_group_id == null ? null : doctor_group_id.trim();
    }

    public String getImage_see() {
        return image_see;
    }

    public void setImage_see(String image_see) {
        this.image_see = image_see == null ? null : image_see.trim();
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

    public String getDiagnostic_opinion() {
        return diagnostic_opinion;
    }

    public void setDiagnostic_opinion(String diagnostic_opinion) {
        this.diagnostic_opinion = diagnostic_opinion == null ? null : diagnostic_opinion.trim();
    }

    public String getReport_info() {
        return report_info;
    }

    public void setReport_info(String report_info) {
        this.report_info = report_info == null ? null : report_info.trim();
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

    public String getQrcode() {
        return qrcode;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode == null ? null : qrcode.trim();
    }

    public String getCheck_type() {
        return check_type;
    }

    public void setCheck_type(String check_type) {
        this.check_type = check_type == null ? null : check_type.trim();
    }

    public Double getImage_see_fee() {
        return image_see_fee;
    }

    public void setImage_see_fee(Double image_see_fee) {
        this.image_see_fee = image_see_fee;
    }

    public Integer getModify_count() {
        return modify_count;
    }

    public void setModify_count(Integer modify_count) {
        this.modify_count = modify_count;
    }

    public String getCheck_point() {
        return check_point;
    }

    public void setCheck_point(String check_point) {
        this.check_point = check_point == null ? null : check_point.trim();
    }

    public Integer getCheck_point_number() {
        return check_point_number;
    }

    public void setCheck_point_number(Integer check_point_number) {
        this.check_point_number = check_point_number;
    }

    public Integer getApply_read_report_info() {
        return apply_read_report_info;
    }

    public void setApply_read_report_info(Integer apply_read_report_info) {
        this.apply_read_report_info = apply_read_report_info;
    }

    public Integer getOperate_read_report_info() {
        return operate_read_report_info;
    }

    public void setOperate_read_report_info(Integer operate_read_report_info) {
        this.operate_read_report_info = operate_read_report_info;
    }

    public Integer getApply_read_modify_image() {
        return apply_read_modify_image;
    }

    public void setApply_read_modify_image(Integer apply_read_modify_image) {
        this.apply_read_modify_image = apply_read_modify_image;
    }

    public Integer getOperate_read_modify_image() {
        return operate_read_modify_image;
    }

    public void setOperate_read_modify_image(Integer operate_read_modify_image) {
        this.operate_read_modify_image = operate_read_modify_image;
    }

    public String getImageSee_status() {
        return imageSee_status;
    }

    public void setImageSee_status(String imageSee_status) {
        this.imageSee_status = imageSee_status == null ? null : imageSee_status.trim();
    }

    public String getAudit_opinion() {
        return audit_opinion;
    }

    public void setAudit_opinion(String audit_opinion) {
        this.audit_opinion = audit_opinion == null ? null : audit_opinion.trim();
    }

    public String getAudit_state() {
        return audit_state;
    }

    public void setAudit_state(String audit_state) {
        this.audit_state = audit_state == null ? null : audit_state.trim();
    }
}