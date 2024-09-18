package com.hengxing.design03;

/**
 * 穿衣装饰类
 * @author hengxing
 * @version 1.0
 * @project DesignModeLearn
 * @date 9/14/2024 15:58:34
 */
public class DressDecorator extends Person {
    private Person innerPerson;

    @Override
    public void operation() {
        System.out.println("--DressDecorator开始执行父类方法--");
        super.operation();
        System.out.println("--DressDecorator执行完父类方法--");
        if (innerPerson != null) {
            innerPerson.operation();// 执行 innerPerson的方法
        }
    }

    public Person getInnerPerson() {
        return innerPerson;
    }

    public void setInnerPerson(Person innerPerson) {
        this.innerPerson = innerPerson;
    }
}
