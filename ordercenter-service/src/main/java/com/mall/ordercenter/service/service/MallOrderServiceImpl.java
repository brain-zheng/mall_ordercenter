package com.mall.ordercenter.service.service;

import com.mall.common.service.util.PageResult;
import com.mall.ordercenter.client.dto.MallOrderDTO;
import com.mall.ordercenter.client.dto.QueryOrderDTO;
import com.mall.ordercenter.client.service.MallOrderService;
import com.mall.ordercenter.service.manager.MallOrderManager;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service("MallOrderServiceImpl")
public class MallOrderServiceImpl implements MallOrderService {

    @Resource
    private MallOrderManager mallOrderManager;

    @Override
    public int insertSelective(MallOrderDTO record) {
        if (record == null) {
            return 0;
        }
        return mallOrderManager.insertSelective(record);
    }

    @Override
    public MallOrderDTO selectByOrderNo(String orderNo) {
        if (StringUtils.isEmpty(orderNo)) {
            return null;
        }
        return mallOrderManager.selectByOrderNo(orderNo);
    }

    @Override
    public int getTotalNewBeeMallOrders(QueryOrderDTO queryOrderDTO) {
        if (queryOrderDTO == null) {
            return 0;
        }
        return mallOrderManager.getTotalNewBeeMallOrders(queryOrderDTO);
    }

    @Override
    public List<MallOrderDTO> findNewBeeMallOrderList(QueryOrderDTO queryOrderDTO) {
        if (queryOrderDTO == null) {
            return new ArrayList<>();
        }
        return mallOrderManager.findNewBeeMallOrderList(queryOrderDTO);
    }

    @Override
    public int closeOrder(List<Integer> orderIds, int orderStatus) {
        if (orderIds == null || orderIds.size() == 0 || orderStatus < 0) {
            return 0;
        }
        return mallOrderManager.closeOrder(orderIds, orderStatus);
    }

    @Override
    public int updateByPrimaryKeySelective(MallOrderDTO record) {
        if (record == null) {
            return  0;
        }
        return mallOrderManager.updateByPrimaryKeySelective(record);
    }

    @Override
    public MallOrderDTO selectByPrimaryKey(Integer orderId) {
        if (orderId < 0) {
            return null;
        }
        return mallOrderManager.selectByPrimaryKey(orderId);
    }

    @Override
    public int checkDone(List<Integer> asList) {
        if (asList == null) {
            return 0;
        }
        return mallOrderManager.checkDone(asList);
    }

    @Override
    public int checkOut(List<Integer> orderIds) {
        if (orderIds == null) {
            return 0;
        }
        return mallOrderManager.checkOut(orderIds);
    }
}
