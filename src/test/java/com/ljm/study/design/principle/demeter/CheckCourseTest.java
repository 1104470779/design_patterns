package com.ljm.study.design.principle.demeter;

import org.junit.Test;

/**
 * @author liujiaming
 */
public class CheckCourseTest {
    @Test
    public void test1(){
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();

        boss.commandCheckNumber(teamLeader);
    }
}
