package com.wt.study.design.pattern.creational.prototype;

import java.text.MessageFormat;

/**
 * @ProjectName: study
 * @Package: com.wt.study.design.pattern.creational.prototype
 * @Description:
 * @Author: lichking2018@aliyun.com
 * @CreateDate: 2019-04-07 18:42
 * @Version: v1.0
 */
public class MailUtil {
    public static void sendMail(Mail mail){
        String outputContent = "向{0}同学，邮件地址：{1}，邮件内容：{2}，发送邮件成功";
        System.out.println(MessageFormat.format(outputContent,mail.getName(),mail.getEmailAddress(),mail.getContent()));
    }

    public static void saveOriginMailRecord(Mail mail){
        System.out.println("存储originMail记录，originMail:"+mail.getContent());
    }
}
