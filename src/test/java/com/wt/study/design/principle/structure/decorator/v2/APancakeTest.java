package com.wt.study.design.principle.structure.decorator.v2;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;
import com.wt.study.design.structure.decorator.v2.AbstractPancake;
import com.wt.study.design.structure.decorator.v2.EggDecorator;
import com.wt.study.design.structure.decorator.v2.Pancake;
import com.wt.study.design.structure.decorator.v2.SausageDecorator;
import org.junit.Test;

import java.io.*;

public class APancakeTest {
    @Test
    public void test1(){
        AbstractPancake abstractPancake;
        abstractPancake = new Pancake();
        abstractPancake = new EggDecorator(abstractPancake);
        abstractPancake = new EggDecorator(abstractPancake);
        abstractPancake = new SausageDecorator(abstractPancake);

        System.out.println(abstractPancake.getDesc()+" 销售价格："+abstractPancake.cost());
    }

    @Test
    public void test2() throws IOException {
        File file = new File("/Users/lichking2015/Documents/temp/项目公司故障分析sql.txt");

        InputStream inputStream = new FileInputStream(file);

        inputStream = new LineInputStream(inputStream);

//        System.out.println(((LineInputStream) inputStream).readLine());

        int count = 0;

        while(count==0){
            count = inputStream.available();
        }

        byte[] b = new byte[count];

        System.out.println(inputStream.read(b));


    }
}
