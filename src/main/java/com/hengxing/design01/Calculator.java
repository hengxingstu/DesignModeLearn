package com.hengxing.design01;

import com.hengxing.design01.operation.Operation;

import java.util.Scanner;

/**
 * 计算器 将界面和计算的逻辑分开
 *
 * @author hengxing
 * @version 1.0
 * @project DesignModeLearn
 * @date 2024/9/3 20:58:30
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入第一个数字");
        String first = scanner.nextLine();
        System.out.println("输入符号");
        String operation = scanner.nextLine();
        System.out.println("输入第二个数字");
        String second = scanner.nextLine();
        Integer firstN = Integer.valueOf(first);
        Integer secondN = Integer.valueOf(second);
        // 用工厂类获取对应计算实例
        Operation op = OperationFactory.getOperation(operation);
        op.setNumberA(firstN);
        op.setNumberB(secondN);
        System.out.println("结果是：" + op.getResult());

    }
}
