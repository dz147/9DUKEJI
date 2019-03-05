package com.nfit.jiudukeji.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.nfit.jiudukeji.entity.JdUser;
import com.nfit.jiudukeji.exception.ResultVO;
import com.nfit.jiudukeji.service.UserService;
import com.nfit.jiudukeji.vo.MD5;
import org.apache.ibatis.jdbc.Null;
import org.mybatis.spring.MyBatisSystemException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.xml.registry.infomodel.User;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/")
public class UserController {


    @Autowired
    private UserService userLogin;

    //登陆API
    @RequestMapping(value = "/userLogin", method = RequestMethod.POST, produces = "application/json;charset=utf-8;")
    public
    @ResponseBody
    ResultVO getUser(@RequestBody JdUser users, HttpSession session) {
        ResultVO vo = new ResultVO<>();
        try {
            users.setUser_pwd(MD5.md5(users.getUser_pwd(), "9du"));
            Page<Object> page = PageHelper.startPage(1, 10);
            JdUser user = userLogin.userLogin(users);
            if (user != null) {
                session.setAttribute("users", user);
            }
            return new ResultVO<JdUser>(200, user,
                    page, "", null);
        } catch (MyBatisSystemException ex) {
            return new ResultVO<JdUser>(402, null,
                    null, ex.getMessage(), null);
        } catch (Exception ex) {
            return new ResultVO<JdUser>(401, null,
                    null, ex.getMessage(), ex);
        }
    }



    /**
     * @ramark 查找用户是否登录
     * @author 张东明
     * @// TODO: 2019/3/1
     * @总结一
     */
    @RequestMapping(value = "/userLogin", method = RequestMethod.GET, produces = "application/json;charset=utf-8;")
    public @ResponseBody
    ResultVO checkUser(HttpSession session) {
        try {
            JdUser users = (JdUser) session.getAttribute("users");
            return new ResultVO<>(200, users,
                    null, "", null);
        } catch (MyBatisSystemException ex) {
            return
                    new ResultVO<>().
                            setCode(402).setError("数据库连接出错");
        } catch (Exception ex) {
            return
                    new ResultVO<>().
                            setCode(401).setError(ex.getMessage()).setThrowable(ex);
        }
    }

    /**
     * @author 张东明
     * @// TODO: 2019/2/26
     */
    @RequestMapping(value = "/createUser", method = RequestMethod.POST, produces = "application/json;charset=utf-8;")
    public
    @ResponseBody
    ResultVO createUser(@RequestBody JdUser users, HttpSession session) {
        try {
            JdUser jdUser = null;
            users.setUser_pwd(MD5.md5(users.getUser_pwd(), "9du"));
            int insert = userLogin.insert(users);
            if (insert > 0) {
                jdUser = userLogin.userLogin(users);
                if (jdUser != null) {
                    session.setAttribute("users", jdUser);
                    return new ResultVO<JdUser>(200, jdUser,
                            null, "", null);
                }
            }
            return new ResultVO<JdUser>(200, jdUser,
                    null, "", null);
        } catch (MyBatisSystemException ex) {
            return new ResultVO<JdUser>(402, null,
                    null, ex.getMessage(), null);
        } catch (Exception ex) {
            return new ResultVO<JdUser>(401, null,
                    null, ex.getMessage(), ex);
        }
    }


}
