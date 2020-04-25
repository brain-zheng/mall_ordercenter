package com.mall.ordercenter.dal.dataobject;

import lombok.Data;

import java.util.Date;

@Data
public class MallOrderItemDO {

    private Integer orderItemId;

    private Integer orderId;

    private Integer goodsId;

    private String goodsName;

    private String goodsCoverImg;

    private Integer sellingPrice;

    private Integer goodsCount;

    private Date createTime;

}
