package com.it.jackson0419.service.impl;

import com.it.jackson0419.dao.IGalleryDao;
import com.it.jackson0419.service.IGalleryService;
import com.it.jackson0419.vo.GalleryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GalleryService implements IGalleryService {
    @Autowired(required = false)
    IGalleryDao galleryDao;

    @Override
    public List<GalleryVO> getGallery() {
        List<GalleryVO> list = galleryDao.getGallery();
        return list;
    }
}
