package com.nfit.jiudukeji.entity;

public class JdBrand {
    private Integer brand_id;

    private String brand_name;

    public Integer getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(Integer brand_id) {
        this.brand_id = brand_id;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name == null ? null : brand_name.trim();
    }

    @Override
    public String toString() {
        return "JdBrand{" +
                "brand_id=" + brand_id +
                ", brand_name='" + brand_name + '\'' +
                '}';
    }
}