package com.ljm.study.design.principle.singleresponseibillity;

/**
 * @author liujiaming
 */
public interface Course {
    String courseName();
    byte[] courseVideo();

    void studyCourse();
    void refundCourse();
}
