package com.nfit.jiudukeji.entity;

import java.math.BigDecimal;

public class JdCart {
    private Integer id;

    private Integer number;

    private BigDecimal prices;

    private Integer ststus;

    private Integer user_id;

    private Integer sku_id;

    private Integer order_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public BigDecimal getPrices() {
        return prices;
    }

    public void setPrices(BigDecimal prices) {
        this.prices = prices;
    }

    public Integer getStstus() {
        return ststus;
    }

    public void setStstus(Integer ststus) {
        this.ststus = ststus;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getSku_id() {
        return sku_id;
    }

    public void setSku_id(Integer sku_id) {
        this.sku_id = sku_id;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }
}