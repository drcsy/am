package com.drcsy.am.dto;

import java.util.Date;

public class Dicom {
    private Integer id;

    private String prid;

    private Integer pixeldata_count;

    private String jpg_url;

    private String dicom_url;

    private String local_str;

    private String modality;

    private String image_type;

    private String series_instance_uid;

    private String sop_instance_uid;

    private Date dsj;

    private String institution_name;

    private String study_description;

    private String patient_name;

    private String patient_id;

    private Date patient_birth_date;

    private String patient_sex;

    private String patient_age;

    private Integer series_number;

    private Integer iqnum;

    private Integer instance_number;

    private Integer rows;

    private Integer columns;

    private String pixel_spacing;

    private Integer window_center;

    private Integer window_width;

    private String image_position;

    private String image_orientation;

    private String bz;

    private String slice_thickness_location;

    private String tre;

    private String rect;

    private String name_first_pinyin;

    private String name_quanpin;

    private Date create_time;

    private String remark;

    private String pixel_data_urls;

    private String belong_hospital_code;

    private String nJpg_url;

    private String ae_title;

    private String network_type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrid() {
        return prid;
    }

    public void setPrid(String prid) {
        this.prid = prid == null ? null : prid.trim();
    }

    public Integer getPixeldata_count() {
        return pixeldata_count;
    }

    public void setPixeldata_count(Integer pixeldata_count) {
        this.pixeldata_count = pixeldata_count;
    }

    public String getJpg_url() {
        return jpg_url;
    }

    public void setJpg_url(String jpg_url) {
        this.jpg_url = jpg_url == null ? null : jpg_url.trim();
    }

    public String getDicom_url() {
        return dicom_url;
    }

    public void setDicom_url(String dicom_url) {
        this.dicom_url = dicom_url == null ? null : dicom_url.trim();
    }

    public String getLocal_str() {
        return local_str;
    }

    public void setLocal_str(String local_str) {
        this.local_str = local_str == null ? null : local_str.trim();
    }

    public String getModality() {
        return modality;
    }

    public void setModality(String modality) {
        this.modality = modality == null ? null : modality.trim();
    }

    public String getImage_type() {
        return image_type;
    }

    public void setImage_type(String image_type) {
        this.image_type = image_type == null ? null : image_type.trim();
    }

    public String getSeries_instance_uid() {
        return series_instance_uid;
    }

    public void setSeries_instance_uid(String series_instance_uid) {
        this.series_instance_uid = series_instance_uid == null ? null : series_instance_uid.trim();
    }

    public String getSop_instance_uid() {
        return sop_instance_uid;
    }

    public void setSop_instance_uid(String sop_instance_uid) {
        this.sop_instance_uid = sop_instance_uid == null ? null : sop_instance_uid.trim();
    }

    public Date getDsj() {
        return dsj;
    }

    public void setDsj(Date dsj) {
        this.dsj = dsj;
    }

    public String getInstitution_name() {
        return institution_name;
    }

    public void setInstitution_name(String institution_name) {
        this.institution_name = institution_name == null ? null : institution_name.trim();
    }

    public String getStudy_description() {
        return study_description;
    }

    public void setStudy_description(String study_description) {
        this.study_description = study_description == null ? null : study_description.trim();
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name == null ? null : patient_name.trim();
    }

    public String getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(String patient_id) {
        this.patient_id = patient_id == null ? null : patient_id.trim();
    }

    public Date getPatient_birth_date() {
        return patient_birth_date;
    }

    public void setPatient_birth_date(Date patient_birth_date) {
        this.patient_birth_date = patient_birth_date;
    }

    public String getPatient_sex() {
        return patient_sex;
    }

    public void setPatient_sex(String patient_sex) {
        this.patient_sex = patient_sex == null ? null : patient_sex.trim();
    }

    public String getPatient_age() {
        return patient_age;
    }

    public void setPatient_age(String patient_age) {
        this.patient_age = patient_age == null ? null : patient_age.trim();
    }

    public Integer getSeries_number() {
        return series_number;
    }

    public void setSeries_number(Integer series_number) {
        this.series_number = series_number;
    }

    public Integer getIqnum() {
        return iqnum;
    }

    public void setIqnum(Integer iqnum) {
        this.iqnum = iqnum;
    }

    public Integer getInstance_number() {
        return instance_number;
    }

    public void setInstance_number(Integer instance_number) {
        this.instance_number = instance_number;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getColumns() {
        return columns;
    }

    public void setColumns(Integer columns) {
        this.columns = columns;
    }

    public String getPixel_spacing() {
        return pixel_spacing;
    }

    public void setPixel_spacing(String pixel_spacing) {
        this.pixel_spacing = pixel_spacing == null ? null : pixel_spacing.trim();
    }

    public Integer getWindow_center() {
        return window_center;
    }

    public void setWindow_center(Integer window_center) {
        this.window_center = window_center;
    }

    public Integer getWindow_width() {
        return window_width;
    }

    public void setWindow_width(Integer window_width) {
        this.window_width = window_width;
    }

    public String getImage_position() {
        return image_position;
    }

    public void setImage_position(String image_position) {
        this.image_position = image_position == null ? null : image_position.trim();
    }

    public String getImage_orientation() {
        return image_orientation;
    }

    public void setImage_orientation(String image_orientation) {
        this.image_orientation = image_orientation == null ? null : image_orientation.trim();
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
    }

    public String getSlice_thickness_location() {
        return slice_thickness_location;
    }

    public void setSlice_thickness_location(String slice_thickness_location) {
        this.slice_thickness_location = slice_thickness_location == null ? null : slice_thickness_location.trim();
    }

    public String getTre() {
        return tre;
    }

    public void setTre(String tre) {
        this.tre = tre == null ? null : tre.trim();
    }

    public String getRect() {
        return rect;
    }

    public void setRect(String rect) {
        this.rect = rect == null ? null : rect.trim();
    }

    public String getName_first_pinyin() {
        return name_first_pinyin;
    }

    public void setName_first_pinyin(String name_first_pinyin) {
        this.name_first_pinyin = name_first_pinyin == null ? null : name_first_pinyin.trim();
    }

    public String getName_quanpin() {
        return name_quanpin;
    }

    public void setName_quanpin(String name_quanpin) {
        this.name_quanpin = name_quanpin == null ? null : name_quanpin.trim();
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getPixel_data_urls() {
        return pixel_data_urls;
    }

    public void setPixel_data_urls(String pixel_data_urls) {
        this.pixel_data_urls = pixel_data_urls == null ? null : pixel_data_urls.trim();
    }

    public String getBelong_hospital_code() {
        return belong_hospital_code;
    }

    public void setBelong_hospital_code(String belong_hospital_code) {
        this.belong_hospital_code = belong_hospital_code == null ? null : belong_hospital_code.trim();
    }

    public String getnJpg_url() {
        return nJpg_url;
    }

    public void setnJpg_url(String nJpg_url) {
        this.nJpg_url = nJpg_url == null ? null : nJpg_url.trim();
    }

    public String getAe_title() {
        return ae_title;
    }

    public void setAe_title(String ae_title) {
        this.ae_title = ae_title == null ? null : ae_title.trim();
    }

    public String getNetwork_type() {
        return network_type;
    }

    public void setNetwork_type(String network_type) {
        this.network_type = network_type == null ? null : network_type.trim();
    }
}