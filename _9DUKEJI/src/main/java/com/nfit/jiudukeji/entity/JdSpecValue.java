package com.nfit.jiudukeji.entity;

import java.util.Date;

public class JdSpecValue {
    private Integer id;

    private Integer spec_id;

    private String spec_value;

    private Date gmt_create;

    private Date gmt_update;

    @Override
    public String toString() {
        return "JdSpecValue{" +
                "id=" + id +
                ", spec_id=" + spec_id +
                ", spec_value='" + spec_value + '\'' +
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

    public Integer getSpec_id() {
        return spec_id;
    }

    public void setSpec_id(Integer spec_id) {
        this.spec_id = spec_id;
    }

    public String getSpec_value() {
        return spec_value;
    }

    public void setSpec_value(String spec_value) {
        this.spec_value = spec_value == null ? null : spec_value.trim();
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