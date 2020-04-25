package com.mall.ordercenter.client.service;

import com.mall.ordercenter.client.dto.MallOrderItemDTO;

import java.util.List;

public interface MallOrderItemService {

    int insertBatch(List<MallOrderItemDTO> orderItems);

    List<MallOrderItemDTO> selectByOrderId(Integer orderId);

    List<MallOrderItemDTO> selectByOrderIds(List<Integer> orderIds);

}
