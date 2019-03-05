package com.nfit.jiudukeji.entity;

public class JdShowPic {
    private Integer id;

    private String pic_name;

    private Integer prod_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPic_name() {
        return pic_name;
    }

    public void setPic_name(String pic_name) {
        this.pic_name = pic_name == null ? null : pic_name.trim();
    }

    public Integer getProd_id() {
        return prod_id;
    }

    public void setProd_id(Integer prod_id) {
        this.prod_id = prod_id;
    }
}