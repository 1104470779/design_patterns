package com.ljm.study.design.pattern.creational.abstractfactory;

/**
 * @author liujiaming
 */
public class JavaArticle extends Article{
    @Override
    public void produce() {
        System.out.println("生产java手记");
    }
}
