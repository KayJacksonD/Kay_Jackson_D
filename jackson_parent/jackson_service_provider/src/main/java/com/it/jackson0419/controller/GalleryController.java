package com.it.jackson0419.controller;

import com.it.jackson0419.service.IGalleryService;
import com.it.jackson0419.vo.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping(value = "/getGallery/{currentPage}/{pageSize}")
    public PageResult getGallery(@PathVariable("currentPage") Integer currentPage,
                                 @PathVariable("pageSize") Integer pageSize) {
        PageResult gallery = galleryService.getGallery(currentPage, pageSize);
        return gallery;
    }
}
