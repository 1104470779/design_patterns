package com.wt.study.design.pattern.creational.builder.v2;

import org.junit.Test;

/**
 * @ProjectName: workspace
 * @Package: com.wt.study.design.pattern.creational.builder.v2
 * @Description:
 * @Author: lichking2018@aliyun.com
 * @CreateDate: 2019/2/13 8:22 PM
 * @Version: v1.0
 */
public class CourseBuilderTest {

    @Test
    public void test1(){
        Course course = new Course.CourseBuilder().buildCourseName("java进阶").buildarticle("java精讲").makeCourse();
        System.out.println(course);
    }
}
