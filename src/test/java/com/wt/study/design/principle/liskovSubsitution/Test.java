package com.wt.study.design.principle.liskovSubsitution;

import com.wt.study.BaseTest;
import com.wt.study.design.principle.liskovSubsitution.methodInput.Child;

import java.util.HashMap;

/**
 * @ProjectName: demo-mode
 * @Package: com.wt.study.principle.liskovSubsitution
 * @Description:
 * @Author: lichking2017@aliyun.com
 * @CreateDate: 2019/1/3 9:54 PM
 * @Version: v1.0
 */
public class Test extends BaseTest{
    @org.junit.Test
    public void test(){
        Child child = new Child();
        HashMap hashMap = new HashMap();
        child.method(hashMap);
    }
}
