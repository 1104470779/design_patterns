package com.ljm.study.design.principle.openclose;

/**
 * @author liujiaming
 */
public class JavaCourseImpl implements CourseInterface{
    private Integer id;
    private String name;
    private Double price;

    public JavaCourseImpl(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}
