package com.nfit.jiudukeji.entity;

import java.util.Date;

public class JdSkuSpecValue {
    private Integer id;

    private Integer sku_id;

    private Integer spec_value_id;

    private Date gmt_create;

    private Date gmt_update;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSku_id() {
        return sku_id;
    }

    public void setSku_id(Integer sku_id) {
        this.sku_id = sku_id;
    }

    public Integer getSpec_value_id() {
        return spec_value_id;
    }

    public void setSpec_value_id(Integer spec_value_id) {
        this.spec_value_id = spec_value_id;
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