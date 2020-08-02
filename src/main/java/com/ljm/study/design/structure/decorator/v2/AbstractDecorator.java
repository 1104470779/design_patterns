package com.ljm.study.design.structure.decorator.v2;

public abstract class AbstractDecorator extends AbstractPancake{
    private AbstractPancake abstractPancake;

    public AbstractDecorator(AbstractPancake abstractPancake) {
        this.abstractPancake = abstractPancake;
    }

    @Override
    public String getDesc() {
        return this.abstractPancake.getDesc();
    }

    @Override
    public int cost() {
        return this.abstractPancake.cost();
    }
}
