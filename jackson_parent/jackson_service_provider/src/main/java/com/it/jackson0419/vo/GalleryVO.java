package com.it.jackson0419.vo;

import lombok.Data;

import java.util.List;

@Data
public class GalleryVO {
    private Long id;
    private String url;//小图地址
    private List<String> srcList; //点击小图后的大图集合地址
}
