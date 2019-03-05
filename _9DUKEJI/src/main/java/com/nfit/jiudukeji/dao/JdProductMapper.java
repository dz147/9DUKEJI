package com.nfit.jiudukeji.dao;

import com.nfit.jiudukeji.entity.JdProduct;
import java.util.List;

public interface JdProductMapper {
    int deleteByPrimaryKey(Integer prod_no);

    int insert(JdProduct record);

    JdProduct selectByPrimaryKey(Integer prod_no);

    List<JdProduct> selectAll();

    int updateByPrimaryKey(JdProduct record);

    int getProductCount();

    List<JdProduct> selectByBrandId(int brandId);

    List<JdProduct> selectByProdName(String prodName);

    List<JdProduct> selectBySales();
}