package com.nfit.jiudukeji.controller;

import com.nfit.jiudukeji.entity.JdShowPic;
import com.nfit.jiudukeji.exception.ResultVO;
import com.nfit.jiudukeji.service.PreviewPictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/")
public class PictureController {
    @Autowired
    private PreviewPictureService previewPictureService;

    @RequestMapping(value = "/selectPicture/{id}", method = RequestMethod.GET, produces = "application/json;charset=utf-8;")
    public @ResponseBody
    ResultVO selectProdAll(@PathVariable("id") int id) {
        List<JdShowPic> jdShowPics = previewPictureService.selectAllById(id);
        return new ResultVO<>(200, jdShowPics,
                null, jdShowPics.size());
    }
}
