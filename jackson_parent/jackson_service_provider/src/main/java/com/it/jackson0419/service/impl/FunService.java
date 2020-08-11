package com.it.jackson0419.service.impl;

import com.it.jackson0419.service.IFunService;
import com.it.jackson0419.utils.ResultUtil;
import com.it.jackson0419.vo.FunVO;
import com.it.jackson0419.vo.ResultVO;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;

@Service
public class FunService implements IFunService {
    @Override
    public ResultVO getFun(FunVO funVO) {
        Double[] fun = initFun();
        BigDecimal eachInputMoney = new BigDecimal(funVO.getEachInputMoney() + "");
        BigDecimal currentPrice = new BigDecimal(funVO.getCurrentPrice() + "");
        BigDecimal period = BigDecimal.valueOf(fun.length);
        BigDecimal account = BigDecimal.valueOf(Arrays.stream(fun).mapToDouble(value -> eachInputMoney.divide(BigDecimal.valueOf(value), 4, BigDecimal.ROUND_HALF_UP).doubleValue()).sum());
        BigDecimal sum = period.multiply(eachInputMoney);
        BigDecimal myEachInputMoney = sum.divide(account, 4, BigDecimal.ROUND_HALF_UP);
        BigDecimal subtractPrice = currentPrice.subtract(myEachInputMoney);
        double endMoney = subtractPrice.multiply(account).doubleValue();
        dealWithResult(funVO, period, account, sum, myEachInputMoney, endMoney);
        return ResultUtil.returnResult(funVO);
    }

    private void dealWithResult(FunVO funVO, BigDecimal period, BigDecimal account, BigDecimal sum, BigDecimal myEachInputMoney, double endMoney) {
        funVO.setPeriod(period);
        funVO.setSum(sum);
        funVO.setAccount(account);
        funVO.setMyEachInputMoney(myEachInputMoney);
        funVO.setEndMoney(endMoney);
    }

    public static Double[] initFun() {
//        Double[] fun = {1.1409};
        Double[] fun = {1.4372};
        return fun;
    }
}
