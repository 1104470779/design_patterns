package com.ljm.study.design.principle.interfacesegregation;

/**
 * @author liujiaming
 */
public class Dog implements EatAnimalAction,SwimAnimalAction{


    @Override
    public void eat() {
        System.out.println("dog eat");
    }

    @Override
    public void swim() {
        System.out.println("dog  swim");
    }
}
