package com.nfit.jiudukeji.service.impl;

import com.nfit.jiudukeji.dao.JdUserMapper;
import com.nfit.jiudukeji.entity.JdUser;
import com.nfit.jiudukeji.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private JdUserMapper jdUserMapper;

    @Override
    public JdUser userLogin(JdUser users) throws Exception {
        if(users == null) {
            return null;
        }
        return jdUserMapper.loginUser(users);
    }

    @Override
    public int insert(JdUser record) {
        if(record.getUser_name() == null || record.getUser_phone() == null || record.getUser_name().equals("")){
            return 0;
        }
        return jdUserMapper.insert(record);
    }
}
