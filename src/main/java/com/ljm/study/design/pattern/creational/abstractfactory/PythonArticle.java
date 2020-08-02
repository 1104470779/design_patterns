package com.ljm.study.design.pattern.creational.abstractfactory;

/**
 * @author liujiaming
 */
public class PythonArticle extends Article{
    @Override
    public void produce() {
        System.out.println("生产phython手记");
    }
}
