package com.nfit.jiudukeji.dao;

import com.nfit.jiudukeji.entity.JdSkuSpecValue;
import java.util.List;

public interface JdSkuSpecValueMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JdSkuSpecValue record);

    JdSkuSpecValue selectByPrimaryKey(Integer id);

    List<JdSkuSpecValue> selectAll();

    int updateByPrimaryKey(JdSkuSpecValue record);
}