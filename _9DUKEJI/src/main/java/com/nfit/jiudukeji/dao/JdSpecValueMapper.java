package com.nfit.jiudukeji.dao;

import com.nfit.jiudukeji.entity.JdSpecValue;
import java.util.List;

public interface JdSpecValueMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JdSpecValue record);

    JdSpecValue selectByPrimaryKey(Integer id);

    List<JdSpecValue> selectAll();

    int updateByPrimaryKey(JdSpecValue record);

    List<JdSpecValue> selectBySpecId(Integer specId);
}