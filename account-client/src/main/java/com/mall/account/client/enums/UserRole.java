package com.mall.account.client.enums;

/**
 * @author zheng haijain
 * @createTime 2020-03-15 17:31
 * @description 用户是否为VIP
 */
public enum UserRole {


    NORMAL(0),

    VIP(1);

    private Integer status;

    UserRole(Integer status){
        this.status = status;
    }

    public Integer getStatus(){
        return this.status;
    }


}
