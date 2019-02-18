package com.wt.study.design.pattern.creational.builder;

import com.wt.study.BaseTest;
import org.junit.Test;

/**
 * @ProjectName: workspace
 * @Package: com.wt.study.design.pattern.creational.builder
 * @Description:
 * @Author: lichking2018@aliyun.com
 * @CreateDate: 2019/1/30 10:41 PM
 * @Version: v1.0
 */
public class CourseBuilderTest extends BaseTest{
    @Test
    public void test1(){
        Coach coach = new Coach();
        coach.setCourseBuilder(new CourseActualBuilder());
        print(coach.makeCourse("java进阶","javaPPT","javaVideo","article","QA"));
    }
}
