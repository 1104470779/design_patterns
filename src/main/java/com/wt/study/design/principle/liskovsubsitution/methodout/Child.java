package com.wt.study.design.principle.liskovsubsitution.methodout;

import java.util.HashMap;

/**
 * @ProjectName: demo-mode
 * @Package: com.wt.study.principle.liskovsubsitution.methodout
 * @Description:
 * @Author: lichking2017@aliyun.com
 * @CreateDate: 2019/1/3 10:02 PM
 * @Version: v1.0
 */
public class Child extends Base{
    @Override
    public HashMap method() {
        HashMap<Object, Object> objectObjectHashMap = new HashMap();
        System.out.println("子类method被执行");
        objectObjectHashMap.put("message","子类method被执行");
        return objectObjectHashMap;
    }
}
