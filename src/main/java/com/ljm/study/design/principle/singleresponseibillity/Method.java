package com.ljm.study.design.principle.singleresponseibillity;

/**
 * @author liujiaming
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
