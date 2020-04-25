package com.mall.ordercenter.client.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class MallOrderItemDTO implements Serializable {

    private static final long serialVersionUID = 1094815765960756633L;

    private Integer orderItemId;

    private Integer orderId;

    private Integer goodsId;

    private String goodsName;

    private String goodsCoverImg;

    private Integer sellingPrice;

    private Integer goodsCount;

    private Date createTime;


}
