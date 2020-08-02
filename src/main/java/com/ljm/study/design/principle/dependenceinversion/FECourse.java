package com.ljm.study.design.principle.dependenceinversion;

/**
 *@author liujiaming
 */
public class FECourse implements Course{
    @Override
    public void studyCourse() {
        System.out.println("学习前端课程");
    }
}
