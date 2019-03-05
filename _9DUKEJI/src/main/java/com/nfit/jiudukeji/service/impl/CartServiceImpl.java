package com.nfit.jiudukeji.service.impl;

import com.nfit.jiudukeji.dao.JdCartMapper;
import com.nfit.jiudukeji.entity.JdCart;
import com.nfit.jiudukeji.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author DZ
 * TODO: 2019/2/26
 */
@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private JdCartMapper jdCartMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(JdCart record) {
        if (record.getNumber() != null && record.getNumber() > 0 && record.getUser_id()
                != null && record.getUser_id() > 0 && record.getPrices() != null && record.getSku_id() != null && record.getSku_id() > 0) {
            jdCartMapper.insert(record);
        }
        return 0;
    }

    @Override
    public JdCart selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public List<JdCart> selectAll() {
        return null;
    }

    @Override
    public int updateByPrimaryKey(JdCart record) {
        return 0;
    }

    @Override
    public int getCartCount(int userId) {
        if (userId > 0) {
            return jdCartMapper.getCartCount(userId);
        }
        return 0;
    }
}
