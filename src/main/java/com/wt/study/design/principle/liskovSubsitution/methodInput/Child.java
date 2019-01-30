package com.wt.study.design.principle.liskovSubsitution.methodInput;

import java.util.HashMap;

/**
 * @ProjectName: demo-mode
 * @Package: com.wt.study.principle.liskovSubsitution.methodInput
 * @Description:
 * @Author: lichking2017@aliyun.com
 * @CreateDate: 2019/1/3 9:52 PM
 * @Version: v1.0
 */
public class Child extends Base{
//    @Override
//    public void method(HashMap map) {
//        System.out.println("子类HashMap入参方法被执行");
//    }

    public void method(HashMap map) {
        System.out.println("子类Map入参方法被执行");
    }

}
