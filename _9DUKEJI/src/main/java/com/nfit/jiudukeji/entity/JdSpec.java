package com.nfit.jiudukeji.entity;

import java.util.Date;

public class JdSpec {
    private Integer id;

    private String spec_no;

    private String spec_name;

    private Date gmt_create;

    private Date gmt_update;

    @Override
    public String toString() {
        return "JdSpec{" +
                "id=" + id +
                ", spec_no='" + spec_no + '\'' +
                ", spec_name='" + spec_name + '\'' +
                ", gmt_create=" + gmt_create +
                ", gmt_update=" + gmt_update +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSpec_no() {
        return spec_no;
    }

    public void setSpec_no(String spec_no) {
        this.spec_no = spec_no == null ? null : spec_no.trim();
    }

    public String getSpec_name() {
        return spec_name;
    }

    public void setSpec_name(String spec_name) {
        this.spec_name = spec_name == null ? null : spec_name.trim();
    }

    public Date getGmt_create() {
        return gmt_create;
    }

    public void setGmt_create(Date gmt_create) {
        this.gmt_create = gmt_create;
    }

    public Date getGmt_update() {
        return gmt_update;
    }

    public void setGmt_update(Date gmt_update) {
        this.gmt_update = gmt_update;
    }
}