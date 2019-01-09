package com.wt.study.principle.liskovSubsitution;

import org.junit.Test;

/**
 * @ProjectName: demo-mode
 * @Package: com.wt.study.principle.liskovSubsitution
 * @Description:
 * @Author: lichking2017@aliyun.com
 * @CreateDate: 2018/12/28 9:55 PM
 * @Version: v1.0
 */
public class SquareTest {
    public static void resize(Quadrangle rectangle){
        while (rectangle.getWidth()<=rectangle.getLength()){
//            rectangle.setWidth(rectangle.getWidth()+1);
            System.out.println("width:"+rectangle.getWidth()+" length:"+rectangle.getLength());
        }
        System.out.println("resize方法结束 width:"+rectangle.getWidth()+" length:"+rectangle.getLength());
    }

    @Test
    public void test1(){
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setLength(20);
        resize(rectangle);
    }

    @Test
    public void test2(){
        Square square = new Square();
        square.setSidelength(20);
        resize(square);
    }
}
