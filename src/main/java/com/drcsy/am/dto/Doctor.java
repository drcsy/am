package com.drcsy.am.dto;

import java.util.Date;

public class Doctor {
    private String id;

    private String login_name;

    private String pwd;

    private String belong_hospital_id;

    private String name;

    private String tel;

    private String sex;

    private Date birthday;

    private Date work_date;

    private String status;

    private String status_desc;

    private String hospital_name;

    private String hospital2_name;

    private String department;

    private String title;

    private String doctor_type;

    private String account;

    private Double cost;

    private String weixin;

    private String email;

    private String specialty;

    private String produce;

    private String cards;

    private Date modify_date;

    private Date create_date;

    private String remark;

    private String head_image;

    private String card_image;

    private String doctor_image;

    private String title_image;

    private String is_apply_doctor;

    private String is_operate_doctor;

    private String is_diagnosis_doctor;

    private String is_audit_doctor;

    private String work_time;

    private String is_online;

    private String name_quanpin;

    private String name_first_pinyin;

    private String belong_city;

    private String department_tel;

    private String doctor_number;

    private String idcard_number;

    private String title_number;

    private String default_apply_doctor;

    private String default_diagnosis_doctor;

    private String voice_Status;

    private String channelId;

    private Integer is_extension_worker;

    private String device_type;

    private String doctor_signature;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getLogin_name() {
        return login_name;
    }

    public void setLogin_name(String login_name) {
        this.login_name = login_name == null ? null : login_name.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getBelong_hospital_id() {
        return belong_hospital_id;
    }

    public void setBelong_hospital_id(String belong_hospital_id) {
        this.belong_hospital_id = belong_hospital_id == null ? null : belong_hospital_id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getWork_date() {
        return work_date;
    }

    public void setWork_date(Date work_date) {
        this.work_date = work_date;
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

    public String getHospital_name() {
        return hospital_name;
    }

    public void setHospital_name(String hospital_name) {
        this.hospital_name = hospital_name == null ? null : hospital_name.trim();
    }

    public String getHospital2_name() {
        return hospital2_name;
    }

    public void setHospital2_name(String hospital2_name) {
        this.hospital2_name = hospital2_name == null ? null : hospital2_name.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDoctor_type() {
        return doctor_type;
    }

    public void setDoctor_type(String doctor_type) {
        this.doctor_type = doctor_type == null ? null : doctor_type.trim();
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

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin == null ? null : weixin.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty == null ? null : specialty.trim();
    }

    public String getProduce() {
        return produce;
    }

    public void setProduce(String produce) {
        this.produce = produce == null ? null : produce.trim();
    }

    public String getCards() {
        return cards;
    }

    public void setCards(String cards) {
        this.cards = cards == null ? null : cards.trim();
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

    public String getHead_image() {
        return head_image;
    }

    public void setHead_image(String head_image) {
        this.head_image = head_image == null ? null : head_image.trim();
    }

    public String getCard_image() {
        return card_image;
    }

    public void setCard_image(String card_image) {
        this.card_image = card_image == null ? null : card_image.trim();
    }

    public String getDoctor_image() {
        return doctor_image;
    }

    public void setDoctor_image(String doctor_image) {
        this.doctor_image = doctor_image == null ? null : doctor_image.trim();
    }

    public String getTitle_image() {
        return title_image;
    }

    public void setTitle_image(String title_image) {
        this.title_image = title_image == null ? null : title_image.trim();
    }

    public String getIs_apply_doctor() {
        return is_apply_doctor;
    }

    public void setIs_apply_doctor(String is_apply_doctor) {
        this.is_apply_doctor = is_apply_doctor == null ? null : is_apply_doctor.trim();
    }

    public String getIs_operate_doctor() {
        return is_operate_doctor;
    }

    public void setIs_operate_doctor(String is_operate_doctor) {
        this.is_operate_doctor = is_operate_doctor == null ? null : is_operate_doctor.trim();
    }

    public String getIs_diagnosis_doctor() {
        return is_diagnosis_doctor;
    }

    public void setIs_diagnosis_doctor(String is_diagnosis_doctor) {
        this.is_diagnosis_doctor = is_diagnosis_doctor == null ? null : is_diagnosis_doctor.trim();
    }

    public String getIs_audit_doctor() {
        return is_audit_doctor;
    }

    public void setIs_audit_doctor(String is_audit_doctor) {
        this.is_audit_doctor = is_audit_doctor == null ? null : is_audit_doctor.trim();
    }

    public String getWork_time() {
        return work_time;
    }

    public void setWork_time(String work_time) {
        this.work_time = work_time == null ? null : work_time.trim();
    }

    public String getIs_online() {
        return is_online;
    }

    public void setIs_online(String is_online) {
        this.is_online = is_online == null ? null : is_online.trim();
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

    public String getBelong_city() {
        return belong_city;
    }

    public void setBelong_city(String belong_city) {
        this.belong_city = belong_city == null ? null : belong_city.trim();
    }

    public String getDepartment_tel() {
        return department_tel;
    }

    public void setDepartment_tel(String department_tel) {
        this.department_tel = department_tel == null ? null : department_tel.trim();
    }

    public String getDoctor_number() {
        return doctor_number;
    }

    public void setDoctor_number(String doctor_number) {
        this.doctor_number = doctor_number == null ? null : doctor_number.trim();
    }

    public String getIdcard_number() {
        return idcard_number;
    }

    public void setIdcard_number(String idcard_number) {
        this.idcard_number = idcard_number == null ? null : idcard_number.trim();
    }

    public String getTitle_number() {
        return title_number;
    }

    public void setTitle_number(String title_number) {
        this.title_number = title_number == null ? null : title_number.trim();
    }

    public String getDefault_apply_doctor() {
        return default_apply_doctor;
    }

    public void setDefault_apply_doctor(String default_apply_doctor) {
        this.default_apply_doctor = default_apply_doctor == null ? null : default_apply_doctor.trim();
    }

    public String getDefault_diagnosis_doctor() {
        return default_diagnosis_doctor;
    }

    public void setDefault_diagnosis_doctor(String default_diagnosis_doctor) {
        this.default_diagnosis_doctor = default_diagnosis_doctor == null ? null : default_diagnosis_doctor.trim();
    }

    public String getVoice_Status() {
        return voice_Status;
    }

    public void setVoice_Status(String voice_Status) {
        this.voice_Status = voice_Status == null ? null : voice_Status.trim();
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId == null ? null : channelId.trim();
    }

    public Integer getIs_extension_worker() {
        return is_extension_worker;
    }

    public void setIs_extension_worker(Integer is_extension_worker) {
        this.is_extension_worker = is_extension_worker;
    }

    public String getDevice_type() {
        return device_type;
    }

    public void setDevice_type(String device_type) {
        this.device_type = device_type == null ? null : device_type.trim();
    }

    public String getDoctor_signature() {
        return doctor_signature;
    }

    public void setDoctor_signature(String doctor_signature) {
        this.doctor_signature = doctor_signature == null ? null : doctor_signature.trim();
    }
}