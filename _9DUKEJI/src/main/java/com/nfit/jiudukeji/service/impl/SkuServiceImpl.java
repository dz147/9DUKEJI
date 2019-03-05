package com.nfit.jiudukeji.service.impl;

import com.nfit.jiudukeji.dao.JdSkuMapper;
import com.nfit.jiudukeji.entity.JdSku;
import com.nfit.jiudukeji.entity.SkuParameter;
import com.nfit.jiudukeji.service.SkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SkuServiceImpl implements SkuService{
    @Autowired
    private JdSkuMapper jdSkuMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(JdSku record) {
        return 0;
    }

    @Override
    public JdSku selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public List<JdSku> selectAll() {
        return null;
    }

    @Override
    public int updateByPrimaryKey(JdSku record) {
        return 0;
    }

    @Override
    public JdSku selectBySpecValue(SkuParameter skuParameter) {
        return  jdSkuMapper.selectBySpecValue(skuParameter);
    }

}
