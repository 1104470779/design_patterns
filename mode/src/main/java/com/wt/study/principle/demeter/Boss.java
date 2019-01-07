package com.wt.study.principle.demeter;

/**
 * @ProjectName: demo-mode
 * @Package: com.wt.study.principle.demeter
 * @Description:
 * @Author: lichking2017@aliyun.com
 * @CreateDate: 2018/12/27 9:04 PM
 * @Version: v1.0
 */
public class Boss {

    public void commandCheckNumber(TeamLeader teamLeader){

        teamLeader.checkNumber();

    }
}
