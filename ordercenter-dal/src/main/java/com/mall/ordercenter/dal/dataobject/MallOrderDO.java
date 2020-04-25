package com.mall.ordercenter.dal.dataobject;

import lombok.Data;

import java.util.Date;

@Data
public class MallOrderDO {

    private Integer orderId;

    private String orderNo;

    private Integer userId;

    private Integer totalPrice;

    private Integer payStatus;

    private Integer payType;

    private Date payTime;

    private Integer orderStatus;

    private String extraInfo;

    private String userAddress;

    private Integer isDeleted;

    private Date createTime;

    private Date updateTime;


}
