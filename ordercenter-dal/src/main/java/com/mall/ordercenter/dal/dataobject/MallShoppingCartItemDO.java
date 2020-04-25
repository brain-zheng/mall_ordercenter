package com.mall.ordercenter.dal.dataobject;

import lombok.Data;

import java.util.Date;

@Data
public class MallShoppingCartItemDO {

    private Integer cartItemId;

    private Integer userId;

    private Integer goodsId;

    private Integer goodsCount;

    private Integer isDeleted;

    private Date createTime;

    private Date updateTime;

}
