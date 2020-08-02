package com.ljm.study.design.principle.structure.decorator.v1;

import com.ljm.study.design.structure.decorator.v1.Pancake;
import com.ljm.study.design.structure.decorator.v1.PancakeWithEge;
import com.ljm.study.design.structure.decorator.v1.PancakeWithSausage;
import org.junit.Test;

public class PancakeTest {
    @Test
    public void test1(){
        Pancake pancake = new Pancake();
        System.out.println(pancake.getDesc()+" 销售价格："+pancake.cost());

        PancakeWithEge pancakeWithEge = new PancakeWithEge();
        System.out.println(pancakeWithEge.getDesc()+" 销售价格："+pancakeWithEge.cost());

        PancakeWithSausage pancakeWithSausage = new PancakeWithSausage();
        System.out.println(pancakeWithSausage.getDesc()+" 销售价格："+pancakeWithSausage.cost());
    }
}
