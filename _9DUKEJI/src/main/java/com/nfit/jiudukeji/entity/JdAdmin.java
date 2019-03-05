package com.nfit.jiudukeji.entity;

import java.util.Date;

public class JdAdmin {
    private Integer adm_id;

    private String adm_name;

    private String adm_account;

    private String adm_pwd;

    private String adm_idcard;

    private Date adm_birthday;

    private String adm_province;

    private String adm_sex;

    private String adm_tel;

    public Integer getAdm_id() {
        return adm_id;
    }

    public void setAdm_id(Integer adm_id) {
        this.adm_id = adm_id;
    }

    public String getAdm_name() {
        return adm_name;
    }

    public void setAdm_name(String adm_name) {
        this.adm_name = adm_name == null ? null : adm_name.trim();
    }

    public String getAdm_account() {
        return adm_account;
    }

    public void setAdm_account(String adm_account) {
        this.adm_account = adm_account == null ? null : adm_account.trim();
    }

    public String getAdm_pwd() {
        return adm_pwd;
    }

    public void setAdm_pwd(String adm_pwd) {
        this.adm_pwd = adm_pwd == null ? null : adm_pwd.trim();
    }

    public String getAdm_idcard() {
        return adm_idcard;
    }

    public void setAdm_idcard(String adm_idcard) {
        this.adm_idcard = adm_idcard == null ? null : adm_idcard.trim();
    }

    public Date getAdm_birthday() {
        return adm_birthday;
    }

    public void setAdm_birthday(Date adm_birthday) {
        this.adm_birthday = adm_birthday;
    }

    public String getAdm_province() {
        return adm_province;
    }

    public void setAdm_province(String adm_province) {
        this.adm_province = adm_province == null ? null : adm_province.trim();
    }

    public String getAdm_sex() {
        return adm_sex;
    }

    public void setAdm_sex(String adm_sex) {
        this.adm_sex = adm_sex == null ? null : adm_sex.trim();
    }

    public String getAdm_tel() {
        return adm_tel;
    }

    public void setAdm_tel(String adm_tel) {
        this.adm_tel = adm_tel == null ? null : adm_tel.trim();
    }
}