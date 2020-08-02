package com.ljm.study.design.structure.decorator.v2;

public class SausageDecorator extends AbstractDecorator{
    public SausageDecorator(AbstractPancake abstractPancake) {
        super(abstractPancake);
    }

    @Override
    public String getDesc() {
        return super.getDesc()+" 加一根香肠";
    }

    @Override
    public int cost() {
        return super.cost()+2;
    }
}
