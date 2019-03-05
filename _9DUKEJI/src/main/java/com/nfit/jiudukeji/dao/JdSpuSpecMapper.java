package com.nfit.jiudukeji.dao;

import com.nfit.jiudukeji.entity.JdSpuSpec;
import java.util.List;

public interface JdSpuSpecMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JdSpuSpec record);

    JdSpuSpec selectByPrimaryKey(Integer id);

    List<JdSpuSpec> selectAll();

    int updateByPrimaryKey(JdSpuSpec record);
}