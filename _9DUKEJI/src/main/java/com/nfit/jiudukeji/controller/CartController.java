package com.nfit.jiudukeji.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.nfit.jiudukeji.dao.JdSkuMapper;
import com.nfit.jiudukeji.entity.JdCart;
import com.nfit.jiudukeji.entity.JdUser;
import com.nfit.jiudukeji.exception.ResultVO;
import com.nfit.jiudukeji.service.CartService;
import com.nfit.jiudukeji.service.UserService;
import org.mybatis.spring.MyBatisSystemException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
/**
 * @author 张东明
 * // TODO: 2019/2/25
 * */
@Controller
@RequestMapping("/")
public class CartController {

    @Autowired
    private CartService cartService;

    /**
     * 查询购物车总数
     * @param cart
     * @author DZ
     * @// TODO: 2019/2/26
     */
    @RequestMapping(value = "/addCart", method = RequestMethod.POST, produces = "application/json;charset=utf-8;")
    public
    @ResponseBody
    ResultVO addCart(@RequestBody JdCart cart) {
        ResultVO vo = new ResultVO<>();
        try {
            return new ResultVO<>(200, cartService.insert(cart),
                    null, "", null);
        } catch (MyBatisSystemException ex) {
            return new ResultVO<JdUser>(402, null,
                    null, ex.getMessage(), null);
        } catch (Exception ex) {
            return new ResultVO<JdUser>(401, null,
                    null, ex.getMessage(), ex);
        }
    }

    /**
     * 查询购物车总数
     * @param userId
     * @author DZ
     * @// TODO: 2019/2/26
     */
    @RequestMapping(value = "/getCountByCart/{userId}", method = RequestMethod.GET, produces = "application/json;charset=utf-8;")
    public
    @ResponseBody
    ResultVO getCartCount(@PathVariable("userId") int userId) {
        ResultVO vo = new ResultVO<>();
        try {
            return new ResultVO<>(200, cartService.getCartCount(userId),
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
