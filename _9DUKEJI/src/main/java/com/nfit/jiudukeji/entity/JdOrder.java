package com.nfit.jiudukeji.entity;

import java.math.BigDecimal;
import java.util.Date;

public class JdOrder {
    private Integer id;

    private Integer user_id;

    private Integer sum;

    private BigDecimal prices;

    private Integer posi_id;

    private String order_number;

    private Integer state;

    private Date gmt_create;

    private Date gmt_update;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public BigDecimal getPrices() {
        return prices;
    }

    public void setPrices(BigDecimal prices) {
        this.prices = prices;
    }

    public Integer getPosi_id() {
        return posi_id;
    }

    public void setPosi_id(Integer posi_id) {
        this.posi_id = posi_id;
    }

    public String getOrder_number() {
        return order_number;
    }

    public void setOrder_number(String order_number) {
        this.order_number = order_number == null ? null : order_number.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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