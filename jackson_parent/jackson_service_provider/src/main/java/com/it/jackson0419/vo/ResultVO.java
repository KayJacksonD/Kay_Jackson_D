package com.it.jackson0419.vo;

import lombok.Data;

@Data
public class ResultVO {
    private String state = TipVO.SUCCESS;//0成功，1失败
    private String msg;
    private Object data;
}
