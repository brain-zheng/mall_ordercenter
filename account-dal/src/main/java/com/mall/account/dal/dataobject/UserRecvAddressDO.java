package com.mall.account.dal.dataobject;

import lombok.Data;

/**
 * @author zheng haijain
 * @createTime 2020-03-17 19:14
 * @description
 */
@Data
public class UserRecvAddressDO extends BaseDO {

    private static final long serialVersionUID = 1078128706458815861L;

    /**
     * 用户Id
     */
    private Long userId;

    /**
     * 收获姓名
     */
    private String name;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 所在省份
     */
    private String province;

    /**
     * 所在城市
     */
    private String city;

    /**
     * 所在地区
     */
    private String region;

    /**
     * 详细地址
     */
    private String detailAddress;

    /**
     * 拓展字段
     */
    private String feature;

    @Override
    public String toString() {
        return super.toString();
    }
}
