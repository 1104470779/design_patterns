package com.wt.study.principle.singleresponseibillity;

/**
 * @ProjectName: demo-mode
 * @Package: com.wt.study.principle.singleresponseibillity
 * @Description:
 * @Author: lichking2017@aliyun.com
 * @CreateDate: 2018/12/20 10:34 PM
 * @Version: v1.0
 */
public interface Course {
    String courseName();
    byte[] courseVido();

    void studyCourse();
    void refundCourse();
}
