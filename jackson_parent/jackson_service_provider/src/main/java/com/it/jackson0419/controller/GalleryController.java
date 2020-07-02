package com.it.jackson0419.controller;

import com.it.jackson0419.service.IGalleryService;
import com.it.jackson0419.utils.ResultUtil;
import com.it.jackson0419.vo.GalleryVO;
import com.it.jackson0419.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/galleryController")
public class GalleryController {
    @Autowired
    IGalleryService galleryService;

    /**
     * 获取Gallery集合
     * http://localhost:18081/test
     */
    @GetMapping(value = "/getGallery")
    public ResultVO getGallery() {
        List<GalleryVO> list = galleryService.getGallery();
        return ResultUtil.returnResult(list);
    }
}
