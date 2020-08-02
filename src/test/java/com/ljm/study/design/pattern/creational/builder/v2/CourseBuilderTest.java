package com.ljm.study.design.pattern.creational.builder.v2;

import org.junit.Test;

/**
 * @author liujiaming
 */
public class CourseBuilderTest {

    @Test
    public void test1(){
        Course course = new Course.CourseBuilder().buildCourseName("java进阶").buildarticle("java精讲").makeCourse();
        System.out.println(course);
    }
}
