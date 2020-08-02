package com.ljm.study.design.principle.dependenceinversion;




/**
 * @author liujiaming
 */
public class JavaCource implements Course {
    @Override
    public void studyCourse() {
        System.out.println("学习java课程");
    }
}
