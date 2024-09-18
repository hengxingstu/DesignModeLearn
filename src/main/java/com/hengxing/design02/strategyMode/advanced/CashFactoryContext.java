package com.hengxing.design02.strategyMode.advanced;

import com.hengxing.design02.strategyMode.cash.CashNormal;
import com.hengxing.design02.strategyMode.cash.CashRebate;
import com.hengxing.design02.strategyMode.cash.CashReturn;
import com.hengxing.design02.strategyMode.cash.CashSuper;

/**
 * 工厂模式改造后的上下文类
 * @author hengxing
 * @version 1.0
 * @project DesignModeLearn
 * @date 9/11/2024 23:03:04
 */
public class CashFactoryContext {
    CashSuper cash;
    public CashFactoryContext(String type) {
        switch (type) {
            case "normal":
                cash = new CashNormal();
                break;
            case "rebate":
                cash = new CashRebate(0.5);
                break;
            case "return":
                cash = new CashReturn(300,100);
                break;
        }
    }

    public double getResult(double money) {
        return cash.acceptCash(money);
    }
}
