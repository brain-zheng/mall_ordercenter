package com.mall.ordercenter.client.enums;

public enum DubboErrorEnum {

    LOGINNAME_IS_NULL("loginName is null"),

    PASSWD_IS_NULL("passwd is null");

    private String result;

    DubboErrorEnum(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }



}
