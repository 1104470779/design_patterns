package com.wt.study.design.principle.liskovSubsitution.methodInput;

import java.util.Map;

/**
 * @ProjectName: demo-mode
 * @Package: com.wt.study.principle.liskovSubsitution.methodInput
 * @Description:
 * @Author: lichking2017@aliyun.com
 * @CreateDate: 2019/1/3 9:51 PM
 * @Version: v1.0
 */
public class Base {
    public void method(Map map){
        System.out.println("父类被执行");

    }
}
