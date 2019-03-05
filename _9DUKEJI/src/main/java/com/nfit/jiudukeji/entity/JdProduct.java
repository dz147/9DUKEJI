package com.nfit.jiudukeji.entity;

import java.math.BigDecimal;
import java.util.Date;

public class JdProduct {
    private Integer prod_no;

    private String prod_name;

    private Integer prod_TypeId;

    private Integer prod_brandId;

    private BigDecimal low_price;

    private Integer state;

    private String picture;

    private Date gmt_create;

    private Date gmt_update;

    private JdProtype jdProtype;

    private int sales;

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public JdProtype getJdProtype() {
        return jdProtype;
    }

    public void setJdProtype(JdProtype jdProtype) {
        this.jdProtype = jdProtype;
    }

    public Integer getProd_no() {
        return prod_no;
    }

    public void setProd_no(Integer prod_no) {
        this.prod_no = prod_no;
    }

    public String getProd_name() {
        return prod_name;
    }

    public void setProd_name(String prod_name) {
        this.prod_name = prod_name == null ? null : prod_name.trim();
    }

    public Integer getProd_TypeId() {
        return prod_TypeId;
    }

    public void setProd_TypeId(Integer prod_TypeId) {
        this.prod_TypeId = prod_TypeId;
    }

    public Integer getProd_brandId() {
        return prod_brandId;
    }

    public void setProd_brandId(Integer prod_brandId) {
        this.prod_brandId = prod_brandId;
    }

    public BigDecimal getLow_price() {
        return low_price;
    }

    public void setLow_price(BigDecimal low_price) {
        this.low_price = low_price;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
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