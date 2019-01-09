package com.wt.study.principle.openclose;

/**
 * @ProjectName: demo-mode
 * @Package: com.wt.study.principle.openclose
 * @Description:
 * @Author: lichking2017@aliyun.com
 * @CreateDate: 2018/12/19 11:00 PM
 * @Version: v1.0
 */
public class JavaCourceImpl implements Cource{
    private Integer id;
    private String name;
    private Double price;

    public JavaCourceImpl(Integer id, String name, Double price) {
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
