package com.mall.account.client.enums;

/**
 * @author zheng haijain
 * @createTime 2020-03-17 14:51
 * @description
 */
public enum AccountStatus {

    ENABLE(1),

    DISABLE(0),

    DELETED(-1);

    private Integer statusCode;

    AccountStatus(Integer status) {
        this.statusCode = status;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

}
