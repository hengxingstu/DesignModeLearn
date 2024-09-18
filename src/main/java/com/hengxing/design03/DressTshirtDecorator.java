package com.hengxing.design03;

/**
 * 穿衬衫装饰类
 * @author hengxing
 * @version 1.0
 * @project DesignModeLearn
 * @date 9/14/2024 16:08:10
 */
public class DressTshirtDecorator extends DressDecorator {
    private String characteristic;

    @Override
    public void operation() {
        System.out.println("--DressTshirtDecorator开始执行父类方法--");
        super.operation();// 在父类执行完后，继续执行后续方法
        System.out.println("--DressTshirtDecorator执行完父类方法--");
        dressTShirt();
    }

    private void dressTShirt(){
        characteristic = "T-shirt is cool.";
        System.out.println("dressTShirt");
    }
}
