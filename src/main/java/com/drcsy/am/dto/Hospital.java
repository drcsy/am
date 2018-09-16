package com.drcsy.am.dto;

import java.util.Date;

public class Hospital {
    private String id;

    private String hospital_name;

    private String hospital_short;

    private String grade1;

    private String grade2;

    private String grade3;

    private String hospital_type;

    private String contact;

    private String contact_tel;

    private String register_date;

    private String salesman;

    private String status;

    private String status_desc;

    private String account;

    private Double cost;

    private String files;

    private Date modify_date;

    private Date create_date;

    private String code;

    private Double moved_fee;

    private String name_quanpin;

    private String name_first_pinyin;

    private String salesman_tel;

    private String introduction;

    private String province;

    private String city;

    private String area;

    private String address;

    private Integer star_level;

    private String practice_license;

    private String hospital_logo;

    private String parent_hospital_code;

    private String is_center_hospital;

    private String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getHospital_name() {
        return hospital_name;
    }

    public void setHospital_name(String hospital_name) {
        this.hospital_name = hospital_name == null ? null : hospital_name.trim();
    }

    public String getHospital_short() {
        return hospital_short;
    }

    public void setHospital_short(String hospital_short) {
        this.hospital_short = hospital_short == null ? null : hospital_short.trim();
    }

    public String getGrade1() {
        return grade1;
    }

    public void setGrade1(String grade1) {
        this.grade1 = grade1 == null ? null : grade1.trim();
    }

    public String getGrade2() {
        return grade2;
    }

    public void setGrade2(String grade2) {
        this.grade2 = grade2 == null ? null : grade2.trim();
    }

    public String getGrade3() {
        return grade3;
    }

    public void setGrade3(String grade3) {
        this.grade3 = grade3 == null ? null : grade3.trim();
    }

    public String getHospital_type() {
        return hospital_type;
    }

    public void setHospital_type(String hospital_type) {
        this.hospital_type = hospital_type == null ? null : hospital_type.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getContact_tel() {
        return contact_tel;
    }

    public void setContact_tel(String contact_tel) {
        this.contact_tel = contact_tel == null ? null : contact_tel.trim();
    }

    public String getRegister_date() {
        return register_date;
    }

    public void setRegister_date(String register_date) {
        this.register_date = register_date == null ? null : register_date.trim();
    }

    public String getSalesman() {
        return salesman;
    }

    public void setSalesman(String salesman) {
        this.salesman = salesman == null ? null : salesman.trim();
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

    public String getFiles() {
        return files;
    }

    public void setFiles(String files) {
        this.files = files == null ? null : files.trim();
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Double getMoved_fee() {
        return moved_fee;
    }

    public void setMoved_fee(Double moved_fee) {
        this.moved_fee = moved_fee;
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

    public String getSalesman_tel() {
        return salesman_tel;
    }

    public void setSalesman_tel(String salesman_tel) {
        this.salesman_tel = salesman_tel == null ? null : salesman_tel.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getStar_level() {
        return star_level;
    }

    public void setStar_level(Integer star_level) {
        this.star_level = star_level;
    }

    public String getPractice_license() {
        return practice_license;
    }

    public void setPractice_license(String practice_license) {
        this.practice_license = practice_license == null ? null : practice_license.trim();
    }

    public String getHospital_logo() {
        return hospital_logo;
    }

    public void setHospital_logo(String hospital_logo) {
        this.hospital_logo = hospital_logo == null ? null : hospital_logo.trim();
    }

    public String getParent_hospital_code() {
        return parent_hospital_code;
    }

    public void setParent_hospital_code(String parent_hospital_code) {
        this.parent_hospital_code = parent_hospital_code == null ? null : parent_hospital_code.trim();
    }

    public String getIs_center_hospital() {
        return is_center_hospital;
    }

    public void setIs_center_hospital(String is_center_hospital) {
        this.is_center_hospital = is_center_hospital == null ? null : is_center_hospital.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}