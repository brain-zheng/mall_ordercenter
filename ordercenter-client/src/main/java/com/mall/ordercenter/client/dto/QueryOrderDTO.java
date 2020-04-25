package com.mall.ordercenter.client.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class QueryOrderDTO implements Serializable {

    private static final long serialVersionUID = -2905406596345168989L;

    private String orderNo;

    private Integer userId;

    private Integer payType;

    private Integer orderStatus;

    private Integer isDeleted;

    private Date startTime;

    private Date endTime;

    private Integer start;

    private Integer limit;
}
