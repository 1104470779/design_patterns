package com.ljm.study.design.pattern.creational.abstractfactory;

import com.ljm.study.BaseTest;
import org.junit.Test;

/**
 * @author liujiaming
 */
public class AbstractFactoryTest {
    @Test
    public void test1(){
        CourseFactory courseFactory = new JavaCourseFactory();

        Video video = courseFactory.getVedio();
        Article article = courseFactory.getArticle();

        video.produce();
        article.produce();
    }
}
