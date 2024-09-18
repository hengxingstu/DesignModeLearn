package com.hengxing.design02.strategyMode.cash;

/**
 * 常规收款类
 * @author hengxing
 * @version 1.0
 * @project DesignModeLearn
 * @date 9/11/2024 22:10:21
 */
public class CashNormal implements CashSuper {

    @Override
    public double acceptCash(double money) {
        return money;
    }
}
