package com.nfit.jiudukeji.dao;

import com.nfit.jiudukeji.entity.JdOrder;
import java.util.List;

public interface JdOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JdOrder record);

    JdOrder selectByPrimaryKey(Integer id);

    List<JdOrder> selectAll();

    int updateByPrimaryKey(JdOrder record);
}