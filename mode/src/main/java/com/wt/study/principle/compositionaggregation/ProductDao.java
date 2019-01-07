package com.wt.study.principle.compositionaggregation;

/**
 * @ProjectName: demo-mode
 * @Package: com.wt.study.principle.compositionaggregation
 * @Description:
 * @Author: lichking2017@aliyun.com
 * @CreateDate: 2019/1/3 10:26 PM
 * @Version: v1.0
 */
public class ProductDao {

    private DBConnection dbConnection;

    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct(){
        String connection = dbConnection.getConnection();
        System.out.println("使用"+connection+"增加产品");
    }
}
