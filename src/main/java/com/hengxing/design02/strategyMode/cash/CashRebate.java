package com.hengxing.design02.strategyMode.cash;

/**
 * 打折收款类
 * @author hengxing
 * @version 1.0
 * @project DesignModeLearn
 * @date 9/11/2024 22:11:31
 */
public class CashRebate implements CashSuper {
    private double discountRate;

    public CashRebate(double discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public double acceptCash(double money) {
        return discountRate * money;
    }

}
