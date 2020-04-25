package com.mall.ordercenter.dal.dao;

import com.mall.ordercenter.dal.dataobject.MallOrderItemDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MallOrderItemDAO {

    int insertBatch(@Param("orderItems") List<MallOrderItemDO> orderItems);

    List<MallOrderItemDO> selectByOrderId(Integer orderId);

    List<MallOrderItemDO> selectByOrderIds(@Param("orderIds") List<Integer> orderIds);

}
