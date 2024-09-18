package com.hengxing.design03;

/**
 * @author hengxing
 * @version 1.0
 * @project DesignModeLearn
 * @date 9/14/2024 16:18:57
 */
public class Test {
    public static void main(String[] args) {
        DressDecorator decorator = new DressDecorator();
        DressTshirtDecorator tshirtDecorator = new DressTshirtDecorator();
        DressPantsDecorator pantsDecorator = new DressPantsDecorator();
        tshirtDecorator.setInnerPerson(decorator);
        pantsDecorator.setInnerPerson(tshirtDecorator);
        pantsDecorator.operation();
    }
}
