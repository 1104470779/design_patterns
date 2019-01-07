package com.wt.study.principle.openclose;

/**
 * @ProjectName: demo-mode
 * @Package: com.wt.study.principle.openclose
 * @Description:
 * @Author: lichking2017@aliyun.com
 * @CreateDate: 2018/12/19 11:27 PM
 * @Version: v1.0
 */
public class JavaDiscountCourse extends JavaCourceImpl{
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginalPrice(){
        return super.getPrice()*0.8;
    }

}
