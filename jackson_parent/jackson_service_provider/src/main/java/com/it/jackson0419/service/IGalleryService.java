package com.it.jackson0419.service;

import com.it.jackson0419.vo.PageResult;

public interface IGalleryService {

    PageResult getGallery(Integer currentPage, Integer pageSize);

}
