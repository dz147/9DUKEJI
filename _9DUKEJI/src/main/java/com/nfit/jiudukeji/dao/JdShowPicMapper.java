package com.nfit.jiudukeji.dao;

import com.nfit.jiudukeji.entity.JdShowPic;
import java.util.List;

public interface JdShowPicMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JdShowPic record);

    JdShowPic selectByPrimaryKey(Integer id);

    List<JdShowPic> selectAll();

    int updateByPrimaryKey(JdShowPic record);

    List<JdShowPic> selectAllById(int id);
}