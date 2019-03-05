package com.nfit.jiudukeji.service.impl;

import com.nfit.jiudukeji.dao.JdShowPicMapper;
import com.nfit.jiudukeji.entity.JdShowPic;
import com.nfit.jiudukeji.service.PreviewPictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PreviewPictureServiceImpl implements PreviewPictureService {

    @Autowired
    JdShowPicMapper jdShowPicMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(JdShowPic record) {
        return 0;
    }

    @Override
    public JdShowPic selectByPrimaryKey(Integer id) {

        return null;
    }

    @Override
    public List<JdShowPic> selectAll() {
        return null;
    }

    @Override
    public int updateByPrimaryKey(JdShowPic record) {
        return 0;
    }

    @Override
    public List<JdShowPic> selectAllById(int id) {
        List<JdShowPic> preview = null;
        if(id>0){
            preview = jdShowPicMapper.selectAllById(id);
        }
        return preview;
    }
}
