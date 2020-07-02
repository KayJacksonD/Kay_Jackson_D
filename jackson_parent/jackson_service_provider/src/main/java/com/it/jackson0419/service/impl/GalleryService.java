package com.it.jackson0419.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.it.jackson0419.dao.IGalleryDao;
import com.it.jackson0419.service.IGalleryService;
import com.it.jackson0419.vo.GalleryVO;
import com.it.jackson0419.vo.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GalleryService implements IGalleryService {
    @Autowired(required = false)
    IGalleryDao galleryDao;

    @Override
    public PageResult getGallery(Integer currentPage, Integer pageSize) {
        // 1：初始化
        PageHelper.startPage(currentPage, pageSize);
        // 2：定义条件查询
        List<GalleryVO> list = galleryDao.getGallery();
        // 3：处理成PageHelper支持的javabean
        PageInfo<GalleryVO> pageInfo = new PageInfo<>(list);
        return new PageResult(pageInfo.getTotal(), pageInfo.getList());

    }
}
