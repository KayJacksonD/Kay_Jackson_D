package com.it.jackson0419.vo;

import lombok.Data;

@Data
public class ApplicationVO {
    private String applicant;
    private String applicationDate;
    private String content;
    private String fistApprove;
    private String fistApproveDate;
    private String firstContent;
    private String secondApprove;
    private String secondApproveDate;
    private String secondContent;
    private String name;//必须属性，不然点击一个选项其他全部展开
}
