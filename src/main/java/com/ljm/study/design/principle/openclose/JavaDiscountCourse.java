package com.ljm.study.design.principle.openclose;

/**
 * @author liujiaming
 */
public class JavaDiscountCourse extends JavaCourseImpl{
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    @Override
    public Integer getId() {
        return super.getId();
    }

    @Override
    public Double getPrice() {
        return super.getPrice()*0.8;
    }

    public Double getOriginPrice(){
        return super.getPrice();
    }

}
