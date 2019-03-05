package com.nfit.jiudukeji.service.impl;

import com.nfit.jiudukeji.dao.JdSpecMapper;
import com.nfit.jiudukeji.entity.JdSpec;
import com.nfit.jiudukeji.service.SpecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SpecServiceImpl implements SpecService {

    @Autowired
    private JdSpecMapper specMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(JdSpec record) {
        return 0;
    }

    @Override
    public JdSpec selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public List<JdSpec> selectAll() {
        return null;
    }

    @Override
    public int updateByPrimaryKey(JdSpec record) {
        return 0;
    }

    @Override
    public List<JdSpec> selectByProdId(Integer prodId) {
        return specMapper.selectByProdId(prodId);
    }
}
