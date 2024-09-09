package com.hengxing.design01.operation;

/**
 * 计算操作抽象类
 * @author hengxing
 * @version 1.0
 * @project DesignModeLearn
 * @date 2024/9/3 22:40:57
 */
public abstract class Operation {
    private double numberA;
    private double numberB;

    abstract public double getResult();

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }
}
