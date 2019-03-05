package com.nfit.jiudukeji.entity;

public class JdUser {
    private Integer user_id;

    private String user_name;

    private String user_pwd;

    private String user_phone;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name == null ? null : user_name.trim();
    }

    public String getUser_pwd() {
        return user_pwd;
    }

    public void setUser_pwd(String user_pwd) {
        this.user_pwd = user_pwd == null ? null : user_pwd.trim();
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone == null ? null : user_phone.trim();
    }
}