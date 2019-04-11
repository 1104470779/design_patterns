package com.wt.study.design.structure.decorator.v1;

public class PancakeWithSausage extends PancakeWithEge{
    @Override
    public String getDesc() {
        return super.getDesc()+"加一个香肠";
    }

    @Override
    public int cost() {
        return super.cost()+2;
    }
}
