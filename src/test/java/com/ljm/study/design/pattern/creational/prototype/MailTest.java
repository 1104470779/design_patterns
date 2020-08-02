package com.ljm.study.design.pattern.creational.prototype;

import org.junit.Test;

/**
 * @ProjectName: study
 * @Package: java.com.wt.study.design.pattern.creational.prototype
 * @Description:
 * @Author: lichking2018@aliyun.com
 * @CreateDate: 2019-04-07 18:49
 * @Version: v1.0
 */
public class MailTest {
    @Test
    public void test1() throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");
        System.out.println("初始化mail:"+mail);
        for (int i = 0; i < 10; i++) {
            Mail mailTemp = (Mail) mail.clone();
            mailTemp.setName("姓名"+i);
            mailTemp.setEmailAddress("姓名"+i+"@imooc.com");
            mailTemp.setContent("恭喜您本次活动中奖了");
            MailUtil.sendMail(mailTemp);
            System.out.println("clone的mailTemp:"+mailTemp);
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
