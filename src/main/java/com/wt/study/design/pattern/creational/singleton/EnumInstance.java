package com.wt.study.design.pattern.creational.singleton;

/**
 * @ProjectName: study
 * @Package: com.wt.study.design.pattern.creational.singleton
 * @Description:
 * @Author: lichking2018@aliyun.com
 * @CreateDate: 2019-03-19 21:42
 * @Version: v1.0
 */
public enum EnumInstance {
    INSTANCE{
        @Override
        protected void printTest(){
            System.out.println("INSTANCE 打印的");
        }
    };
    protected abstract void printTest();
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance(){
        return INSTANCE;
    }
}
