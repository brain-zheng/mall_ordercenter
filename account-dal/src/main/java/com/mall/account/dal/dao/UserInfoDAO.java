package com.mall.account.dal.dao;

import com.mall.account.dal.dataobject.UserInfoDO;

/**
 * @author zheng haijain
 * @createTime 2020-03-15 17:39
 * @description 用户基本信息查询
 */
public interface UserInfoDAO extends BaseDAO<UserInfoDO> {

    UserInfoDO getByUserId(Long userId);

}
