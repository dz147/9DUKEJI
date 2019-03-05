package com.nfit.jiudukeji.controller;

import com.nfit.jiudukeji.entity.JdSku;
import com.nfit.jiudukeji.entity.JdUser;
import com.nfit.jiudukeji.entity.SkuParameter;
import com.nfit.jiudukeji.exception.ResultVO;
import com.nfit.jiudukeji.service.SkuService;
import org.mybatis.spring.MyBatisSystemException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class SkuController {

    @Autowired
    private SkuService skuService;

    @RequestMapping(value = "/getsku", method = RequestMethod.POST, produces = "application/json;charset=utf-8;")
    public
    @ResponseBody
    ResultVO getSku(@RequestBody SkuParameter skuParameter) {
        try{
            JdSku jdSku = skuService.selectBySpecValue(skuParameter);
            return new ResultVO<JdSku>(200, jdSku,
                    null, "", null);
        } catch (MyBatisSystemException ex) {
            return new ResultVO<JdSku>(402, null,
                    null, ex.getMessage(), null);
        } catch (Exception ex) {
            return new ResultVO<JdSku>(401, null,
                    null, ex.getMessage(), ex);
        }
    }


}
