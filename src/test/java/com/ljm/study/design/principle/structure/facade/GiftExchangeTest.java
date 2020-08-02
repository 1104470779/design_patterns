package com.ljm.study.design.principle.structure.facade;

import com.ljm.study.design.structure.facade.GiftExchangeService;
import com.ljm.study.design.structure.facade.PointsGift;
import org.junit.Test;

public class GiftExchangeTest {
    @Test
    public void test1(){
        PointsGift pointsGift = new PointsGift("T桖");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchange(pointsGift);
    }
}
