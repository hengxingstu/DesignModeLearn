package com.hengxing.design02.factoryModel.impl;

import com.hengxing.design02.factoryModel.CashSuper;

/**
 * 正常收费，原价返回
 * @author hengxing
 * @version 1.0
 * @project DesignModeLearn
 * @date 9/9/2024 23:16:07
 */
public class CashNormal extends CashSuper {

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
        return cash;
    }
}
