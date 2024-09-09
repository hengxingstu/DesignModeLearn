package com.hengxing.design01.operation;

/**
 * 减法
 * @author hengxing
 * @version 1.0
 * @project DesignModeLearn
 * @date 2024/9/3 22:58:21
 */
public class MinusOperation extends Operation {
    @Override
    public double getResult() {
        return getNumberA() - getNumberB();
    }
}
