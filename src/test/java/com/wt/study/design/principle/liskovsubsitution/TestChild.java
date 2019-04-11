package com.wt.study.design.principle.liskovsubsitution;

import org.junit.Test;

import java.util.HashMap;

/**
 * @ProjectName: demo-mode
 * @Package: com.wt.study.principle.liskovsubsitution
 * @Description:
 * @Author: lichking2017@aliyun.com
 * @CreateDate: 2018/12/30 12:32 AM
 * @Version: v1.0
 */
public class TestChild {
    @Test
    public void test1(){
        Child child = new Child();
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        child.method(objectObjectHashMap);
    }
}
