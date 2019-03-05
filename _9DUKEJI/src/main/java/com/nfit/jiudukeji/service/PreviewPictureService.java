package com.nfit.jiudukeji.service;

import com.nfit.jiudukeji.entity.JdShowPic;

import java.util.List;

public interface PreviewPictureService {
    int deleteByPrimaryKey(Integer id);

    int insert(JdShowPic record);

    JdShowPic selectByPrimaryKey(Integer id);

    List<JdShowPic> selectAll();

    int updateByPrimaryKey(JdShowPic record);

    List<JdShowPic> selectAllById(int id);
    
}
