package com.nfit.jiudukeji.service;

import com.nfit.jiudukeji.entity.JdBrand;
import org.mybatis.spring.MyBatisSystemException;

import java.util.List;

public interface BrandService {
    List<JdBrand> selectBrandAll()throws MyBatisSystemException,Exception;
}
