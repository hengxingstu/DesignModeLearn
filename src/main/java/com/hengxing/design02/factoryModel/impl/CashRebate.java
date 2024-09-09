package com.hengxing.design02.factoryModel.impl;

import com.hengxing.design02.factoryModel.CashSuper;

/**
 * 打折收费
 *
 * @author hengxing
 * @version 1.0
 * @project DesignModeLearn
 * @date 9/9/2024 23:22:35
 */
public class CashRebate extends CashSuper {
    private Double cashRebate;

    public CashRebate(Double cashRebate) {
        this.cashRebate = cashRebate;
    }


    /**
     * 收款
     *
     * @param cash
     * @return java.lang.Double
     * @author hengxing
     * @date 9/9/2024 23:14:57
     */
    @Override
    public Double acceptCash(Double cash) {
        return cashRebate * cash;
    }
}
