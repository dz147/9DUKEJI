package com.nfit.jiudukeji.service;

import com.nfit.jiudukeji.entity.JdSpec;
import com.nfit.jiudukeji.entity.JdSpecValue;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring/spring-service.xml", "classpath:spring/spring-dao.xml"})

public class SpecServiceImplTest {
    private static Logger logger = Logger.getLogger(SpecServiceImplTest.class);
    @Autowired
    private SpecService specService;
    @Autowired
    private SpecValueService specValueService;

    @Test
    public void selectByProdId() {
        List<JdSpec> jdSpecs = specService.selectByProdId(1);
        for (JdSpec s : jdSpecs) {
            List<JdSpecValue> specValues =
                    specValueService.selectBySpecId(s.getId());
            System.out.println(s.getId() + ";" + specValues.toString());
        }
    }
}