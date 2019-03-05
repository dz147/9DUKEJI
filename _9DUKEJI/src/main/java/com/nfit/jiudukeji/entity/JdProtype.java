package com.nfit.jiudukeji.entity;

public class JdProtype {
    private Integer prot_id;

    private String prot_name;

    public Integer getProt_id() {
        return prot_id;
    }

    public void setProt_id(Integer prot_id) {
        this.prot_id = prot_id;
    }

    public String getProt_name() {
        return prot_name;
    }

    public void setProt_name(String prot_name) {
        this.prot_name = prot_name == null ? null : prot_name.trim();
    }
}