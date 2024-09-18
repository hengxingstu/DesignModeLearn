package com.hengxing.design02.strategyMode.simple;

import com.hengxing.design02.strategyMode.cash.CashSuper;

/**
 * 上下文类
 * @author hengxing
 * @version 1.0
 * @project DesignModeLearn
 * @date 9/11/2024 22:07:46
 */
public class CashContext {
    private CashSuper cash;
    public CashContext(CashSuper cash) {
        this.cash = cash;
    }
    public double getResult(double money) {
        return cash.acceptCash(money);
    }
}
