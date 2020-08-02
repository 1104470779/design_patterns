package com.ljm.study.design.principle.compositionaggregation;

/**
 * @ProjectName: demo-mode
 * @Package: com.wt.study.principle.compositionaggregation
 * @Description:
 * @Author: lichking2017@aliyun.com
 * @CreateDate: 2019/1/3 10:38 PM
 * @Version: v1.0
 */
public class MysqlConnection extends DBConnection{
    @Override
    public String getConnection() {
        return "MySql数据库连接";
    }
}
