package com.nfit.jiudukeji.dao;

import com.nfit.jiudukeji.entity.UserComment;
import java.util.List;

public interface UserCommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserComment record);

    UserComment selectByPrimaryKey(Integer id);

    List<UserComment> selectAll();

    int updateByPrimaryKey(UserComment record);
}