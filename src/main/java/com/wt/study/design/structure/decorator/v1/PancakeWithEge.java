package com.wt.study.design.structure.decorator.v1;

public class PancakeWithEge extends Pancake{
    @Override
    public String getDesc() {
        return super.getDesc()+"加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost()+1;
    }
}
