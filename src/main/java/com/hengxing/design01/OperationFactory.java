package com.hengxing.design01;

import com.hengxing.design01.operation.AddOperation;
import com.hengxing.design01.operation.MinusOperation;
import com.hengxing.design01.operation.Operation;

/**
 * 计算类工厂
 *
 * @author hengxing
 * @version 1.0
 * @project DesignModeLearn
 * @date 2024/9/3 22:40:10
 */
public class OperationFactory {
    public static Operation getOperation(String operate) {
        Operation operation = null;
        switch (operate) {
            case "+":
                operation = new AddOperation();
                break;
            case "-":
                operation = new MinusOperation();
                break;
            default:
                throw new ArithmeticException("没有对应的计算符号，请检查");
        }
        return operation;
    }
}
