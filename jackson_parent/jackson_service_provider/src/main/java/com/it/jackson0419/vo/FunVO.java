package com.it.jackson0419.vo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class FunVO {
    private BigDecimal period = new BigDecimal("0.0000");
    private BigDecimal eachInputMoney = new BigDecimal("0.0000");
    private BigDecimal currentPrice = new BigDecimal("0.00");
    private BigDecimal account = new BigDecimal("0.0000");
    private BigDecimal sum = new BigDecimal("0.0000");
    private BigDecimal myEachInputMoney = new BigDecimal("0.0000");
    private Double endMoney;
}
