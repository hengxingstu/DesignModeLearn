package com.hengxing.design01.operation;

/**
 * 加法
 * @author hengxing
 * @version 1.0
 * @project DesignModeLearn
 * @date 2024/9/3 22:54:59
 */
public class AddOperation extends Operation {
    @Override
    public double getResult() {
        return getNumberA() + getNumberB();
    }
}
