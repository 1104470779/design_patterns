package com.wt.study.design.principle.structure.facade;

import com.wt.study.design.structure.facade.*;
import org.junit.Test;

public class GiftExchangeTest {
    @Test
    public void test1(){
        PointsGift pointsGift = new PointsGift("T桖");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchange(pointsGift);
    }
}
