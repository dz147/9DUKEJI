package com.nfit.jiudukeji.service;

import com.nfit.jiudukeji.entity.JdUser;

public interface UserService {
    JdUser userLogin(JdUser users) throws Exception;

    int insert(JdUser record);
}
