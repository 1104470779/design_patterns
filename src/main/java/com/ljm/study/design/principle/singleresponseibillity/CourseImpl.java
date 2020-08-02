package com.ljm.study.design.principle.singleresponseibillity;

/**
 * @author liujiaming
 */
public class CourseImpl implements CourseContent,CourseManager{
    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }

    @Override
    public String courseName() {
        return null;
    }

    @Override
    public byte[] courseVideo() {
        return new byte[0];
    }
}
