package com.wt.study.design.principle.openclose;

import com.wt.study.BaseTest;
import com.wt.study.design.principle.openclose.Cource;
import com.wt.study.design.principle.openclose.JavaCourceImpl;
import com.wt.study.design.principle.openclose.JavaDiscountCourse;
import org.junit.Test;

/**
 * @ProjectName: demo-mode
 * @Package: com.wt.study.principle.openclose
 * @Description:
 * @Author: lichking2017@aliyun.com
 * @CreateDate: 2018/12/19 11:03 PM
 * @Version: v1.0
 */
public class CourceTest extends BaseTest{

    @Test
    public void test1(){
        Cource cource = new JavaCourceImpl(96,"Java从0到企业级电商开发",348d);
        print("课程ID："+cource.getId()+"课程名称："+cource.getName()+"课程价格："+cource.getPrice());
    }

    @Test
    public void test2(){
        Cource cource = new JavaDiscountCourse(96,"Java从0到企业级电商开发",348d);
        JavaDiscountCourse discountCourse = (JavaDiscountCourse)cource;

        print("课程ID："+cource.getId()+"课程名称："+cource.getName()+"课程价格："+discountCourse.getOriginalPrice()
                +"打折后的价格："+discountCourse.getPrice());
    }

//    @Test
//    public void test3(){
//        Geely geely = new Geely();
//
//        geely.studyJavaCource();
//        geely.studyFeCource();
//    }

    @Test
    public void test4(){

    }
}
