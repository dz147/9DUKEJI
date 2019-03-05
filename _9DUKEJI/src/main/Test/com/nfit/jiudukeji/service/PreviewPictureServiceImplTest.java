package com.nfit.jiudukeji.service;

import com.nfit.jiudukeji.entity.JdProduct;
import com.nfit.jiudukeji.entity.JdShowPic;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring/spring-service.xml","classpath:spring/spring-dao.xml"})
public class PreviewPictureServiceImplTest {

    @Autowired
    PreviewPictureService previewPictureService;

    @Test
    public void selectByPrimaryKey() {
        List<JdShowPic> jdShowPics = previewPictureService.selectAllById(4);
        for (JdShowPic s:jdShowPics) {
            System.out.println(s.getPic_name());
        }
    }


}