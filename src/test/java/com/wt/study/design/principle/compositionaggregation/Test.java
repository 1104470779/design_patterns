package com.wt.study.design.principle.compositionaggregation;

import com.wt.study.BaseTest;
import com.wt.study.design.principle.compositionaggregation.MysqlConnection;
import com.wt.study.design.principle.compositionaggregation.PostgreeConnection;
import com.wt.study.design.principle.compositionaggregation.ProductDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @ProjectName: demo-mode
 * @Package: com.wt.study.principle.compositionaggregation
 * @Description:
 * @Author: lichking2017@aliyun.com
 * @CreateDate: 2019/1/3 10:27 PM
 * @Version: v1.0
 */
public class Test extends BaseTest {
    @org.junit.Test
    public void test(){
        ProductDao productDao = new ProductDao();
        productDao.setDbConnection(new MysqlConnection());
        productDao.addProduct();
    }

    @org.junit.Test
    public void test1(){
        ProductDao productDao = new ProductDao();
        productDao.setDbConnection(new PostgreeConnection());
        productDao.addProduct();
    }

    @org.junit.Test
    public void test2() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("");
    }
}
