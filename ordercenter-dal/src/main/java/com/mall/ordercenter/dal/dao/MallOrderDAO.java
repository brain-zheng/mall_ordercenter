package com.mall.ordercenter.dal.dao;

import com.mall.ordercenter.client.dto.MallOrderDTO;
import com.mall.ordercenter.client.dto.QueryOrderDTO;
import com.mall.ordercenter.dal.dataobject.MallOrderDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MallOrderDAO {

    int insertSelective(MallOrderDO record);

    MallOrderDO selectByOrderNo(String orderNo);

    int getTotalNewBeeMallOrders(QueryOrderDTO queryOrderDTO);

    List<MallOrderDO> findNewBeeMallOrderList(QueryOrderDTO queryOrderDTO);

    int closeOrder(@Param("orderIds") List<Integer> orderIds, @Param("orderStatus") int orderStatus);

    int updateByPrimaryKeySelective(MallOrderDO record);

    MallOrderDO selectByPrimaryKey(Integer orderId);

    int checkDone(@Param("orderIds") List<Integer> asList);

    int checkOut(@Param("orderIds") List<Integer> orderIds);
}


