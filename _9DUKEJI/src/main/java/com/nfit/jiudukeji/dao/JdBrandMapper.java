package com.nfit.jiudukeji.dao;

import com.nfit.jiudukeji.entity.JdBrand;
import java.util.List;

public interface JdBrandMapper {
    int deleteByPrimaryKey(Integer brand_id);

    int insert(JdBrand record);

    JdBrand selectByPrimaryKey(Integer brand_id);

    List<JdBrand> selectAll();

    int updateByPrimaryKey(JdBrand record);
}