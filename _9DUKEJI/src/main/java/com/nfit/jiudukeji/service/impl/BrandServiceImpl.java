package com.nfit.jiudukeji.service.impl;

import com.nfit.jiudukeji.dao.JdBrandMapper;
import com.nfit.jiudukeji.entity.JdBrand;
import com.nfit.jiudukeji.service.BrandService;
import org.mybatis.spring.MyBatisSystemException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private JdBrandMapper jdBrandMapper;

    @Override
    public List<JdBrand> selectBrandAll() throws MyBatisSystemException, Exception {
        List<JdBrand> jdBrands = jdBrandMapper.selectAll();
        return jdBrands;
    }
}
