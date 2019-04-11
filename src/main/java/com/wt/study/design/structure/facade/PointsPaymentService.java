package com.wt.study.design.structure.facade;

/**
 * 支付子系统
 */
public class PointsPaymentService {

    public boolean pay(PointsGift pointsGift){
        //扣减积分
        System.out.println("支付"+pointsGift.getName()+" 积分支付成功");
        return true;
    }
}
