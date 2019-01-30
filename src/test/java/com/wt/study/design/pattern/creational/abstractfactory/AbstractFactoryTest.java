package com.wt.study.design.pattern.creational.abstractfactory;

import com.wt.study.BaseTest;
import org.junit.Test;

/**
 * @ProjectName: idea
 * @Package: com.wt.study.design.pattern.creational.abstractfactory
 * @Description:
 * @Author: lichking2017@aliyun.com
 * @CreateDate: 2019/1/15 10:02 PM
 * @Version: v1.0
 */
public class AbstractFactoryTest extends BaseTest{
    @Test
    public void test1(){
        CourseFactory courseFactory = new JavaCourseFactory();

        Video video = courseFactory.getVedio();
        Article article = courseFactory.getArticle();

        video.produce();
        article.produce();
    }
}
