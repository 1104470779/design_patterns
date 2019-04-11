package com.wt.study.design.structure.decorator.v2;

public class Pancake extends AbstractPancake{
    @Override
    public String getDesc() {
        return "煎饼";
    }

    @Override
    public int cost() {
        return 8;
    }
}
