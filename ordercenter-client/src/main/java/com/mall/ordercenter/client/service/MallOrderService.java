package com.mall.ordercenter.client.service;

import com.mall.common.service.util.PageQueryUtil;
import com.mall.ordercenter.client.dto.MallOrderDTO;
import com.mall.ordercenter.client.dto.QueryOrderDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MallOrderService {

    int insertSelective(MallOrderDTO record);

    MallOrderDTO selectByOrderNo(String orderNo);

    int getTotalNewBeeMallOrders(QueryOrderDTO queryOrderDTO);

    List<MallOrderDTO> findNewBeeMallOrderList(QueryOrderDTO queryOrderDTO);

    int closeOrder(List<Integer> orderIds, int orderStatus);

    int updateByPrimaryKeySelective(MallOrderDTO record);

    MallOrderDTO selectByPrimaryKey(Integer orderId);

    int checkDone(List<Integer> asList);

    int checkOut(List<Integer> orderIds);
}
