package com.wt.study.principle.singleresponseibillity;

import org.junit.Test;

/**
 * @ProjectName: demo-mode
 * @Package: com.wt.study.principle.singleresponseibillity
 * @Description:
 * @Author: lichking2017@aliyun.com
 * @CreateDate: 2018/12/20 9:58 PM
 * @Version: v1.0
 */
public class BirdTest {
    @Test
    public void test1(){
        Bird bird = new Bird();
        bird.mainMoveMode("大雁");
        bird.mainMoveMode("鸵鸟");
    }

    @Test
    public void test2(){
        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("大雁");
        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("鸵鸟");
    }
}