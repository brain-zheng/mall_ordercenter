package com.mall.account.dal.dataobject;

import com.mall.account.client.enums.UserGender;
import com.mall.account.client.enums.UserRole;
import lombok.Data;

import java.util.Date;

/**
 * @author zheng haijain
 * @createTime 2020-03-15 16:08
 * @description 用户信息DO
 */
@Data
public class UserInfoDO extends BaseDO {

    private static final long serialVersionUID = 1981943286391613559L;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 用户昵称
     */
    private String nickName;

    /**
     * 头像
     */
    private String head;

    /**
     * 性别
     * @see com.mall.account.client.enums.UserGender
     * todo 这里暂时使用字符串代替了枚举类型，有时间的话需要改造，使用mybatis的枚举转换器
     * 具体参考 https://blog.csdn.net/fighterandknight/category_6249083.html
     */
    private String gender;

    /**
     * VIP
     * @see com.mall.account.client.enums.UserRole
     * todo 这里暂时使用字符串代替了枚举类型，有时间的话需要改造，使用mybatis的枚举转换器
     * 具体参考 https://blog.csdn.net/fighterandknight/category_6249083.html
     */
    private Integer role;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 个性签名
     */
    private String signature;

    /**
     * 拓展字段
     */
    private String feature;

    @Override
    public String toString(){
        return super.toString();
    }

}
