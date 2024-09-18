package com.hengxing.design03;

/**
 * 牛仔裤装饰类
 * @author hengxing
 * @version 1.0
 * @project DesignModeLearn
 * @date 9/14/2024 16:17:22
 */
public class DressPantsDecorator extends DressDecorator {
    @Override
    public void operation() {

        System.out.println("--DressPantsDecorator开始执行父类方法--");
        super.operation();
        System.out.println("--DressPantsDecorator执行完父类方法--");
        dressPants();
    }

    private void dressPants(){
        System.out.println("穿牛仔裤");
    }
}
