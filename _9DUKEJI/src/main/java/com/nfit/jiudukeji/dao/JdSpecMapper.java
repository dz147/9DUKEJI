package com.nfit.jiudukeji.dao;

import com.nfit.jiudukeji.entity.JdSpec;
import java.util.List;

public interface JdSpecMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JdSpec record);

    JdSpec selectByPrimaryKey(Integer id);

    List<JdSpec> selectAll();

    int updateByPrimaryKey(JdSpec record);

    List<JdSpec> selectByProdId(Integer prodId);
}