package com.nfit.jiudukeji.service;

import com.nfit.jiudukeji.entity.JdProduct;

import java.util.List;

public interface ProductService {
    List<JdProduct> selectAll();

    int getProductCount();

    List<JdProduct> selectByBrandId(int brandId);

    List<JdProduct> selectByProdName(String prodName);

    List<JdProduct> selectBySales();
}
