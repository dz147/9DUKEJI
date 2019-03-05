package com.nfit.jiudukeji.dao;

import com.nfit.jiudukeji.entity.JdPositions;
import java.util.List;

public interface JdPositionsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JdPositions record);

    JdPositions selectByPrimaryKey(Integer id);

    List<JdPositions> selectAll();

    int updateByPrimaryKey(JdPositions record);
}