package com.wt.study.principle.demeter;

import org.junit.Test;

/**
 * @ProjectName: demo-mode
 * @Package: com.wt.study.principle.demeter
 * @Description:
 * @Author: lichking2017@aliyun.com
 * @CreateDate: 2018/12/27 9:11 PM
 * @Version: v1.0
 */
public class CheckCourseTest {
    @Test
    public void test1(){
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();

        boss.commandCheckNumber(teamLeader);
    }
}
