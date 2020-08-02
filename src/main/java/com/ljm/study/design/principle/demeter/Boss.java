package com.ljm.study.design.principle.demeter;

/**
 * @author liujiaming
 */
public class Boss {

    public void commandCheckNumber(TeamLeader teamLeader){

        teamLeader.checkNumber();

    }
}
