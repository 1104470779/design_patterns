package com.ljm.study.design.pattern.creational.prototype.clone;

import java.util.Date;

/**
 * @ProjectName: study
 * @Package: com.wt.study.design.pattern.creational.prototype.clone
 * @Description:
 * @Author: lichking2018@aliyun.com
 * @CreateDate: 2019-04-07 21:40
 * @Version: v1.0
 */
public class Pig implements Cloneable{
    private String name;
    private Date birthday;

    public Pig(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Pig pig = (Pig) super.clone();
        //深克隆
        pig.birthday = (Date) pig.birthday.clone();
        return pig;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}'+super.toString();
    }
}
