package com.nfit.jiudukeji.entity;

import java.util.Date;

public class JdSpuSpec {
    private Integer id;

    private Integer spu_id;

    private Integer spec_id;

    private Date gmt_create;

    private Date gmt_update;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSpu_id() {
        return spu_id;
    }

    public void setSpu_id(Integer spu_id) {
        this.spu_id = spu_id;
    }

    public Integer getSpec_id() {
        return spec_id;
    }

    public void setSpec_id(Integer spec_id) {
        this.spec_id = spec_id;
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