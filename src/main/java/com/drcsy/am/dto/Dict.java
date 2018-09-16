package com.drcsy.am.dto;

public class Dict {
    private String id;

    private String name;

    private String en_name;

    private String code;

    private String type;

    private String db_table_name;

    private String db_field_name;

    private String order_code;

    private String deleted;

    private String is_hide;

    private String parent_id;

    private String parent_code;

    private String is_leaf;

    private String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEn_name() {
        return en_name;
    }

    public void setEn_name(String en_name) {
        this.en_name = en_name == null ? null : en_name.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getDb_table_name() {
        return db_table_name;
    }

    public void setDb_table_name(String db_table_name) {
        this.db_table_name = db_table_name == null ? null : db_table_name.trim();
    }

    public String getDb_field_name() {
        return db_field_name;
    }

    public void setDb_field_name(String db_field_name) {
        this.db_field_name = db_field_name == null ? null : db_field_name.trim();
    }

    public String getOrder_code() {
        return order_code;
    }

    public void setOrder_code(String order_code) {
        this.order_code = order_code == null ? null : order_code.trim();
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted == null ? null : deleted.trim();
    }

    public String getIs_hide() {
        return is_hide;
    }

    public void setIs_hide(String is_hide) {
        this.is_hide = is_hide == null ? null : is_hide.trim();
    }

    public String getParent_id() {
        return parent_id;
    }

    public void setParent_id(String parent_id) {
        this.parent_id = parent_id == null ? null : parent_id.trim();
    }

    public String getParent_code() {
        return parent_code;
    }

    public void setParent_code(String parent_code) {
        this.parent_code = parent_code == null ? null : parent_code.trim();
    }

    public String getIs_leaf() {
        return is_leaf;
    }

    public void setIs_leaf(String is_leaf) {
        this.is_leaf = is_leaf == null ? null : is_leaf.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}