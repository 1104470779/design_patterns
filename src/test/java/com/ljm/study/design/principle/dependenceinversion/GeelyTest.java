package com.ljm.study.design.principle.dependenceinversion;

import com.ljm.study.BaseTest;
import org.junit.Test;

/**
 * @author liujiaming
 */
public class GeelyTest {
    @Test
    public void test1(){
        Geely geely = new Geely();
        geely.setCourse(new JavaCource());
        geely.studyCourse();
        geely.setCourse(new FECourse());
        geely.studyCourse();
    }
}
