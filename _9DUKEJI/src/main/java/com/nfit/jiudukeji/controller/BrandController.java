package com.nfit.jiudukeji.controller;

import com.nfit.jiudukeji.entity.JdBrand;
import com.nfit.jiudukeji.exception.ResultVO;
import com.nfit.jiudukeji.service.BrandService;
import org.mybatis.spring.MyBatisSystemException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
import java.util.logging.Logger;

@Controller
@RequestMapping("/")
public class BrandController {
    private static Logger logger = Logger.getLogger(String.valueOf(BrandController.class));

    @Autowired
    private BrandService  brandService;

    @RequestMapping(value = "/selectBrand", method = RequestMethod.GET, produces = "application/json;charset=utf-8;")
    public @ResponseBody
    ResultVO selectBrandAll(){
        try {
            List<JdBrand> jdBrands = brandService.selectBrandAll();
            return new ResultVO<>(200, jdBrands, null,0);
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

    @RequestMapping(value = "/SelectBrandById/{id}", method = RequestMethod.GET, produces = "application/json;charset=utf-8;")
    public @ResponseBody
    String selectBrandById(@PathVariable("id")int id){
        System.out.println(id);
        return "";
    }
}
