package com.wt.study.principle.singleresponseibillity;

/**
 * @ProjectName: demo-mode
 * @Package: com.wt.study.principle.singleresponseibillity
 * @Description:
 * @Author: lichking2017@aliyun.com
 * @CreateDate: 2018/12/20 9:56 PM
 * @Version: v1.0
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
