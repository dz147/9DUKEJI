package com.nfit.jiudukeji.service;

import com.nfit.jiudukeji.entity.JdSku;
import com.nfit.jiudukeji.entity.SkuParameter;

import java.util.List;

public interface SkuService {
    int deleteByPrimaryKey(Integer id);

    int insert(JdSku record);

    JdSku selectByPrimaryKey(Integer id);

    List<JdSku> selectAll();

    int updateByPrimaryKey(JdSku record);

    JdSku selectBySpecValue(SkuParameter skuParameter);

}
