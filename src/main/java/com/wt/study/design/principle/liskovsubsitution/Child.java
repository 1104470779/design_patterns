package com.wt.study.design.principle.liskovsubsitution;

import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName: demo-mode
 * @Package: com.wt.study.principle.liskovsubsitution
 * @Description:
 * @Author: lichking2017@aliyun.com
 * @CreateDate: 2018/12/30 12:27 AM
 * @Version: v1.0
 */
public class Child extends Base {
    @Override
    public void method(HashMap hashMap) {
        System.out.println("子类HashMap被执行");
    }

    public void method(Map map){
        System.out.println("子类Map入参方法");
    }
}
