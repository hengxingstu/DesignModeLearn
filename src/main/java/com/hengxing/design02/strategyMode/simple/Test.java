package com.hengxing.design02.strategyMode.simple;

import com.hengxing.design02.strategyMode.advanced.CashFactoryContext;

import java.util.regex.Pattern;

/**
 * @author hengxing
 * @version 1.0
 * @project DesignModeLearn
 * @date 9/11/2024 22:26:35
 */
public class Test {
    public static void main(String[] args) {
        double money = 1000.00;
        CashFactoryContext context = new CashFactoryContext("normal");
        System.out.println("context.getResult(money) = " + context.getResult(money));
        CashFactoryContext context1 = new CashFactoryContext("rebate");
        System.out.println("context1.getResult(money) = " + context1.getResult(money));
        CashFactoryContext context2 = new CashFactoryContext("return");
        System.out.println("context2.getResult(money) = " + context2.getResult(money));

        System.out.println(
                Pattern.matches("^[0-9a-zA-Z()\\-+'.,/:]*$",
                "1213,."));
    }
}
