package com.nfit.jiudukeji.entity;

import java.math.BigDecimal;
import java.util.Date;

public class JdSku {
    private Integer id;

    private String sku_name;

    private BigDecimal price;

    private Integer stock;

    private Integer spu_id;

    private Date gmt_create;

    private Date gmt_update;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSku_name() {
        return sku_name;
    }

    public void setSku_name(String sku_name) {
        this.sku_name = sku_name == null ? null : sku_name.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getSpu_id() {
        return spu_id;
    }

    public void setSpu_id(Integer spu_id) {
        this.spu_id = spu_id;
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