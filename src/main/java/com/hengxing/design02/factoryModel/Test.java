package com.hengxing.design02.factoryModel;

/**
 * @author hengxing
 * @version 1.0
 * @project DesignModeLearn
 * @date 9/9/2024 23:34:38
 */
public class Test {
    public static void main(String[] args) {
        CashSuper normal = new CashFactory().createCashAccept("正常");
        System.out.println(normal.acceptCash(100.0));
        CashSuper disCount = new CashFactory().createCashAccept("打9折");
        System.out.println(disCount.acceptCash(100.0));
        CashSuper refund = new CashFactory().createCashAccept("满100返20");
        System.out.println(refund.acceptCash(300.0));
    }
}
