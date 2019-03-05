package com.nfit.jiudukeji.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.nfit.jiudukeji.entity.JdProduct;
import com.nfit.jiudukeji.entity.JdUser;
import com.nfit.jiudukeji.exception.ResultVO;
import com.nfit.jiudukeji.service.ProductService;
import org.mybatis.spring.MyBatisSystemException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/")
public class ProductController {
    @Autowired
    private ProductService productService;

    //首页渲染
    @RequestMapping(value = "/selectProd/{page}", method = RequestMethod.GET, produces = "application/json;charset=utf-8;")
    public @ResponseBody
    ResultVO selectProdAll(@PathVariable("page") int page) {
        try {
            Page<Object> objects = PageHelper.startPage(page, 12);
            List<JdProduct> jdProducts = productService.selectAll();
            return new ResultVO<>(200, jdProducts,
                    objects, productService.getProductCount());
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

    @RequestMapping(value = "/selectByBrandId/{brandId}", method = RequestMethod.GET, produces = "application/json;charset=utf-8;")
    public @ResponseBody
    ResultVO ProdByBrandId(@PathVariable("brandId") int brandId) {
        try {
            Page<Object> objects = PageHelper.startPage(1, 8);
            List<JdProduct> jdProducts = productService.selectByBrandId(brandId);
            return new ResultVO<>(200, jdProducts,
                    objects, jdProducts.size());
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

    @RequestMapping(value = "/selectByProdName/{prodName}", method = RequestMethod.GET, produces = "application/json;charset=utf-8;")
    public @ResponseBody
    ResultVO ProdByBrandId(@PathVariable("prodName") String prodName) {
        try {
            List<JdProduct> jdProducts = productService.selectByProdName(prodName);
            return new ResultVO<>(200, jdProducts,
                    null, jdProducts.size());
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

    @RequestMapping(value = "/getSales", method = RequestMethod.GET, produces = "application/json;charset=utf-8;")
    public @ResponseBody
    ResultVO getSales() {
        try {
            List<JdProduct> jdProducts = productService.selectBySales();
            return new ResultVO<>(200, jdProducts,
                    null, jdProducts.size());
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
}
