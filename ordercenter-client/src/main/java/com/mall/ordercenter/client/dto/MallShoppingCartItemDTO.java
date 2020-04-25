package com.mall.ordercenter.client.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class MallShoppingCartItemDTO implements Serializable {

    private static final long serialVersionUID = 1944045113737559658L;

    private Integer cartItemId;

    private Integer userId;

    private Integer goodsId;

    private Integer goodsCount;

    private Integer isDeleted;

    private Date createTime;

    private Date updateTime;

}
