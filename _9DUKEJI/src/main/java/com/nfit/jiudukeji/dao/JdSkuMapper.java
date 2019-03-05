package com.nfit.jiudukeji.dao;

import com.nfit.jiudukeji.entity.JdSku;
import com.nfit.jiudukeji.entity.SkuParameter;

import java.util.List;

public interface JdSkuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JdSku record);

    JdSku selectByPrimaryKey(Integer id);

    List<JdSku> selectAll();

    int updateByPrimaryKey(JdSku record);

    JdSku selectBySpecValue(SkuParameter skuParameter);

}