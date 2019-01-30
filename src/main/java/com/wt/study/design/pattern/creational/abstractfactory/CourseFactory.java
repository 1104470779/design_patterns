package com.wt.study.design.pattern.creational.abstractfactory;

/**
 * @ProjectName: idea
 * @Package: com.wt.study.design.pattern.creational.abstractfactory
 * @Description:
 * @Author: lichking2017@aliyun.com
 * @CreateDate: 2019/1/15 9:23 PM
 * @Version: v1.0
 */
public interface CourseFactory {
    Video getVedio();
    Article getArticle();
}
