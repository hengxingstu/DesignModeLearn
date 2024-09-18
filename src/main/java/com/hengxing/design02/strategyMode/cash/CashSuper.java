package com.hengxing.design02.strategyMode.cash;

/**
 * 收钱接口，也可以是一个超类，这里只是尝试不同解法
 * @author hengxing
 * @version 1.0
 * @project DesignModeLearn
 * @date 9/11/2024 22:08:20
 */
public interface CashSuper {
    public double acceptCash(double money);
}
