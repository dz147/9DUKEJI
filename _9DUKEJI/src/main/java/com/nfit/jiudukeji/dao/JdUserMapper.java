package com.nfit.jiudukeji.dao;

import com.nfit.jiudukeji.entity.JdUser;
import java.util.List;

public interface JdUserMapper {
    int deleteByPrimaryKey(Integer user_id);

    int insert(JdUser record);

    JdUser selectByPrimaryKey(Integer user_id);

    List<JdUser> selectAll();

    int updateByPrimaryKey(JdUser record);

    JdUser loginUser(JdUser jdUser);
}