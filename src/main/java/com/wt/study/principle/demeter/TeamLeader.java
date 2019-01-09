package com.wt.study.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: demo-mode
 * @Package: com.wt.study.principle.demeter
 * @Description:
 * @Author: lichking2017@aliyun.com
 * @CreateDate: 2018/12/27 9:05 PM
 * @Version: v1.0
 */
public class TeamLeader {

    public void checkNumber(){
        List<Course> courses = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            courses.add(new Course());
        }
        System.out.println(courses.size());
    }
}
