package com.ljm.study.design.principle.dependenceinversion;

/**
 * @author liujiaming
 */
public class Geely {


    private Course course;

    public void setCourse(Course course) {
        this.course = course;
    }

    public void studyCourse(){
        course.studyCourse();
    }
}
