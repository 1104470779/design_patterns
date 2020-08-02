package com.ljm.study.design.principle.openclose;

import com.ljm.study.BaseTest;
import org.junit.Test;

/**
 *
 */
public class CourseTest {

    @Test
    public void test1(){
        CourseInterface cource = new JavaCourseImpl(96,"Java课程",348d);
        System.out.println(("课程ID："+cource.getId()+"课程名称："+cource.getName()+"课程价格："+cource.getPrice()));
    }

    @Test
    public void test2(){
        CourseInterface course = new JavaDiscountCourse(96,"java课程",348d);
        JavaDiscountCourse discountCourse = (JavaDiscountCourse) course;
        System.out.println(("课程ID："+discountCourse.getId()+"课程名称："+discountCourse.getName()+"课程价格："+discountCourse.getOriginPrice()
                +"打折后的价格："+discountCourse.getPrice()));
    }

}
