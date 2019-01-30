package com.wt.study.design.pattern.creational.abstractfactory;

/**
 * @ProjectName: idea
 * @Package: com.wt.study.design.pattern.creational.abstractfactory
 * @Description:
 * @Author: lichking2017@aliyun.com
 * @CreateDate: 2019/1/15 9:39 PM
 * @Version: v1.0
 */
public class PythonCourceFactory implements CourseFactory{
    @Override
    public Video getVedio() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
