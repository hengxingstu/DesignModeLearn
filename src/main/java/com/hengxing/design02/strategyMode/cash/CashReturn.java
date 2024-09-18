package com.hengxing.design02.strategyMode.cash;

/**
 * 满减收款类
 * @author hengxing
 * @version 1.0
 * @project DesignModeLearn
 * @date 9/11/2024 22:21:13
 */
public class CashReturn implements CashSuper {
    private double moneyCondition;
    private double moneyReturn;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        if (money >= moneyCondition) {
            return money - Math.floor(money / moneyCondition) * moneyReturn;
        }
        return money;
    }
}
