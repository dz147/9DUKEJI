package com.nfit.jiudukeji.service.impl;

import com.nfit.jiudukeji.dao.JdProductMapper;
import com.nfit.jiudukeji.entity.JdProduct;
import com.nfit.jiudukeji.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private JdProductMapper jdProductMapper;
    @Override
    public List<JdProduct> selectAll() {
        List<JdProduct> jdProducts = jdProductMapper.selectAll();
        if(jdProducts != null){
            return jdProducts;
        }
        return null;
    }

    @Override
    public int getProductCount() {
        int productCount = jdProductMapper.getProductCount();
        if(productCount>0){
            return productCount;
        }
        return 0;
    }

    @Override
    public List<JdProduct> selectByBrandId(int brandId) {
        List<JdProduct> jdProducts = jdProductMapper.selectByBrandId(brandId);
            return jdProducts;
    }

    @Override
    public List<JdProduct> selectByProdName(String prodName) {
        List<JdProduct> jdProducts = jdProductMapper.selectByProdName(prodName);
        return jdProducts;
    }

    @Override
    public List<JdProduct> selectBySales() {
        return jdProductMapper.selectBySales();
    }
}
