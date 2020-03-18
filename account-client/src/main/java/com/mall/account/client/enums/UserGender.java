package com.mall.account.client.enums;

/**
 * @author zheng haijain
 * @createTime 2020-03-15 16:41
 * @description 性别
 */
public enum UserGender {

    MAlE("male"),

    FEMALE("female"),

    UNKNOWN("unknown");

    /**
     * 性别
     */
    private String gender;

    UserGender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return this.gender;
    }

}
