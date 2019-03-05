package com.nfit.jiudukeji.dao;

import com.nfit.jiudukeji.entity.JdAdmin;
import java.util.List;

public interface JdAdminMapper {
    int deleteByPrimaryKey(Integer adm_id);

    int insert(JdAdmin record);

    JdAdmin selectByPrimaryKey(Integer adm_id);

    List<JdAdmin> selectAll();

    int updateByPrimaryKey(JdAdmin record);
}