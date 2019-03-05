package com.nfit.jiudukeji.dao;

import com.nfit.jiudukeji.entity.JdProtype;
import java.util.List;

public interface JdProtypeMapper {
    int deleteByPrimaryKey(Integer prot_id);

    int insert(JdProtype record);

    JdProtype selectByPrimaryKey(Integer prot_id);

    List<JdProtype> selectAll();

    int updateByPrimaryKey(JdProtype record);
}