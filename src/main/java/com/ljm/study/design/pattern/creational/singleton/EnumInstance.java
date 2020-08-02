package com.ljm.study.design.pattern.creational.singleton;

/**
 * @author liujiaming
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
