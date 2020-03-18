package com.mall.account.dal.dataobject;

import lombok.Data;

/**
 * @author zheng haijain
 * @createTime 2020-03-17 14:47
 * @description 账户信息
 */
@Data
public class AccountDO extends BaseDO {

    private static final long serialVersionUID = -224754754535919712L;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 状态
     * @see com.mall.account.client.enums.AccountStatus
     * todo mybatis 枚举转换
     */
    private Integer status;

    /**
     * 拓展字段
     */
    private String feature;

    @Override
    public String toString() {
        return super.toString();
    }
}
