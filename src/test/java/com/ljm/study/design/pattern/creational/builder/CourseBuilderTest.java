package com.ljm.study.design.pattern.creational.builder;

import com.ljm.study.BaseTest;
import org.junit.Test;

/**
 * @author liujiaming
 */
public class CourseBuilderTest {
    @Test
    public void test1(){
        Course course = new CourseActualBuilder().buildCourseName("java").buildvideo("javaVideo").makeCourse();
        System.out.println(course);
    }
}
