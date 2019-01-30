package com.wt.study.design.principle.singleresponseibillity;

/**
 * @ProjectName: demo-mode
 * @Package: com.wt.study.principle.singleresponseibillity
 * @Description:
 * @Author: lichking2017@aliyun.com
 * @CreateDate: 2018/12/20 10:41 PM
 * @Version: v1.0
 */
public class Method {
    //不好的习惯
    public void updateUserInfo(String userName,String address){
        userName = "gelly";
        address = "beijing";
    }
    //不好的习惯
    private void updateUserInfo(String userName,String... properties){
        userName = "gelly";
    }

    //不好的习惯
    public void updateUserInfo(String userName,String address,boolean bool){
        if(bool){
            //todo 1
        }else{
            //todo 2
        }
    }

    //正确
    public void updateUserName(String userName){
        userName = "gelly";
    }
    //正确
    public void updateUserAddress(String address){
        address = "beijing";
    }
}
