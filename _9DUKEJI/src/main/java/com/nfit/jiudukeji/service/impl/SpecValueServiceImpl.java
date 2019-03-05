package com.nfit.jiudukeji.service.impl;

import com.nfit.jiudukeji.dao.JdSpecValueMapper;
import com.nfit.jiudukeji.entity.JdSpecValue;
import com.nfit.jiudukeji.service.SpecValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecValueServiceImpl implements SpecValueService {
    @Autowired
    private JdSpecValueMapper specValueMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(JdSpecValue record) {
        return 0;
    }

    @Override
    public JdSpecValue selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public List<JdSpecValue> selectAll() {
        return null;
    }

    @Override
    public int updateByPrimaryKey(JdSpecValue record) {
        return 0;
    }

    @Override
    public List<JdSpecValue> selectBySpecId(Integer specId) {
        return specValueMapper.selectBySpecId(specId);
    }
}
