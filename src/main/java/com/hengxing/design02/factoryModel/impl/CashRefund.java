package com.hengxing.design02.factoryModel.impl;

import com.hengxing.design02.factoryModel.CashSuper;

/**
 * 返利收费方法
 * @author hengxing
 * @version 1.0
 * @project DesignModeLearn
 * @date 9/9/2024 23:19:16
 */
public class CashRefund extends CashSuper {
    /**
     * 返利条件
     */
    private Double refundCondition;
    /**
     * 返利金额
     */
    private Double refundAmount;

    public CashRefund(Double refundCondition, Double refundAmount) {
        this.refundCondition = refundCondition;
        this.refundAmount = refundAmount;
    }

    /**
     * 收款方法
     *
     * @param cash
     * @return java.lang.Double
     * @author hengxing
     * @date 9/9/2024 23:14:57
     */
    @Override
    public Double acceptCash(Double cash) {
        if (cash >= refundCondition) {
            return cash - Math.floor(cash / refundCondition) * refundAmount;
        }
        return cash;
    }
}
