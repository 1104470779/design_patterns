package com.ljm.study.design.principle.liskovsubsitution;

/**
 * @ProjectName: demo-mode
 * @Package: com.wt.study.principle.liskovsubsitution
 * @Description:
 * @Author: lichking2017@aliyun.com
 * @CreateDate: 2018/12/28 9:47 PM
 * @Version: v1.0
 */
public class Square implements Quadrangle{

    private long sidelength;


    @Override
    public long getWidth() {
        return sidelength;
    }

    @Override
    public long getLength() {
        return sidelength;
    }

    public long getSidelength() {
        return sidelength;
    }

    public void setSidelength(long sidelength) {
        this.sidelength = sidelength;
    }
}
