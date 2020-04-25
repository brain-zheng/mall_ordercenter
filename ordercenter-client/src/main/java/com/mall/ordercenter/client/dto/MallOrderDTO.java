package com.mall.ordercenter.client.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class MallOrderDTO implements Serializable {

    private static final long serialVersionUID = -696995419211023489L;

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
