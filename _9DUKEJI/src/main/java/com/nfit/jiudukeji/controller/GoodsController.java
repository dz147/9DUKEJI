package com.nfit.jiudukeji.controller;

import com.nfit.jiudukeji.entity.JdSpec;
import com.nfit.jiudukeji.entity.JdSpecValue;
import com.nfit.jiudukeji.entity.JdUser;
import com.nfit.jiudukeji.exception.ResultVO;
import com.nfit.jiudukeji.service.SpecService;
import com.nfit.jiudukeji.service.SpecValueService;
import org.apache.log4j.Logger;
import org.mybatis.spring.MyBatisSystemException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/")
public class GoodsController {

    private static Logger logger = Logger.getLogger(GoodsController.class);

    @Autowired
    private SpecService specService;

    @Autowired
    private SpecValueService specValueService;

    @RequestMapping(value = "/loadingSpec/{id}", method = RequestMethod.GET, produces = "application/json;charset=utf-8;")
    public
    @ResponseBody
    ResultVO getSpecs(@PathVariable("id") int id) {
        try {
            logger.info(id);
            List<JdSpec> jdSpecs = specService.selectByProdId(id);
            return new ResultVO(200, jdSpecs);
        } catch (MyBatisSystemException ex) {
            return new ResultVO<JdSpec>(402, null,
                    null, ex.getMessage(), null);
        } catch (Exception ex) {
            return new ResultVO<JdSpec>(401, null,
                    null, ex.getMessage(), ex);
        }
    }

    @RequestMapping(value = "/selectSpecValues/{id}", method = RequestMethod.GET, produces = "application/json;charset=utf-8;")
    public
    @ResponseBody
    ResultVO getSpecValues(@PathVariable("id") int id) {
        try {
            logger.info(id);
            List<JdSpecValue> jdSpecsValues = specValueService.selectBySpecId(id);
            return new ResultVO(200, jdSpecsValues);
        } catch (MyBatisSystemException ex) {
            return new ResultVO<JdSpec>(402, null,
                    null, ex.getMessage(), null);
        } catch (Exception ex) {
            return new ResultVO<JdSpec>(401, null,
                    null, ex.getMessage(), ex);
        }
    }
}
