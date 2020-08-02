package com.ljm.study.design.principle.singleresponseibillity;

/**
 * @author liujiaming
 */
public class Bird {
    public void mainMoveMode(String birdName){
        if("鸵鸟".equals(birdName)){
            System.out.println(birdName+"用脚走路");
        }else{
            System.out.println(birdName+"用翅膀飞");
        }
    }
}
