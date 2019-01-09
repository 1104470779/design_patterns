package com.wt.study.principle.liskovSubsitution;

import java.util.HashMap;

/**
 * @ProjectName: demo-mode
 * @Package: com.wt.study.principle.liskovSubsitution
 * @Description:
 * @Author: lichking2017@aliyun.com
 * @CreateDate: 2018/12/30 12:25 AM
 * @Version: v1.0
 */
public class Base {
    public void method(HashMap hashMap){
        System.out.println("父类被执行");

    }
}
