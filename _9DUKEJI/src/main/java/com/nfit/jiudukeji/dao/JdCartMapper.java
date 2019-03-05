package com.nfit.jiudukeji.dao;

import com.nfit.jiudukeji.entity.JdCart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Dz
 */
public interface JdCartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JdCart record);

    JdCart selectByPrimaryKey(Integer id);

    List<JdCart> selectAll();

    int updateByPrimaryKey(JdCart record);

    /**
     * 查询购物车总数
     * @param userId
     * @return int
     * @author DZ
     * @// TODO: 2019/2/26
     */
    int getCartCount(@Param("userId") int userId);
}