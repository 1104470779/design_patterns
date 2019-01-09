package com.wt.study.principle.singleresponseibillity;

/**
 * @ProjectName: demo-mode
 * @Package: com.wt.study.principle.singleresponseibillity
 * @Description:
 * @Author: lichking2017@aliyun.com
 * @CreateDate: 2018/12/20 10:37 PM
 * @Version: v1.0
 */
public class CourseImpl implements CourseContent,CourseManager{
    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }

    @Override
    public String courseName() {
        return null;
    }

    @Override
    public byte[] courseVido() {
        return new byte[0];
    }
}
