package com.mall.ordercenter.service.service;

import com.mall.ordercenter.client.dto.MallOrderItemDTO;
import com.mall.ordercenter.client.service.MallOrderItemService;
import com.mall.ordercenter.service.manager.MallOrderItemManager;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service("MallOrderItemServiceImpl")
public class MallOrderItemServiceImpl implements MallOrderItemService {

    @Resource
    private MallOrderItemManager mallOrderItemManager;

    @Override
    public int insertBatch(List<MallOrderItemDTO> orderItems) {
        if (orderItems == null || orderItems.size() == 0) {
            return 0;
        }
        return  mallOrderItemManager.insertBatch(orderItems);
    }

    @Override
    public List<MallOrderItemDTO> selectByOrderId(Integer orderId) {
        if (orderId < 0 ) {
            return new ArrayList<>();
        }
        return mallOrderItemManager.selectByOrderId(orderId);

    }

    @Override
    public List<MallOrderItemDTO> selectByOrderIds(List<Integer> orderIds) {
        if (orderIds == null || orderIds.size() == 0) {
            return new ArrayList<>();
        }
        return mallOrderItemManager.selectByOrderIds(orderIds);
    }
}
