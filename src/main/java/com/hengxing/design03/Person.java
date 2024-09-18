package com.hengxing.design03;

import java.util.Objects;

/**
 * 人物类，最初的类只有基本的功能
 * @author hengxing
 * @version 1.0
 * @project DesignModeLearn
 * @date 9/14/2024 15:55:12
 */
public class Person {
    private String name;
    private Integer age;

    public void operation(){
        System.out.println("父类方法");
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Person person = (Person) object;
        return Objects.equals(name, person.name) && Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(age);
        return result;
    }

    public Person(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
