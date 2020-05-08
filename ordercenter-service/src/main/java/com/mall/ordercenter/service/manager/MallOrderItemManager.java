package com.mall.ordercenter.service.manager;

import com.mall.ordercenter.client.dto.MallOrderItemDTO;
import com.mall.ordercenter.dal.dao.MallOrderItemDAO;
import com.mall.ordercenter.dal.dataobject.MallOrderItemDO;
import com.mall.ordercenter.service.converter.MallOrderConverter;
import com.mall.ordercenter.service.converter.MallOrderItemConverter;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class MallOrderItemManager {

    @Resource
    private MallOrderItemDAO mallOrderItemDAO;

    public int insertBatch(List<MallOrderItemDTO> orderItems) {
        List<MallOrderItemDO> mallOrderItemDOS = orderItems.stream().map(MallOrderItemConverter::dto2do).collect(Collectors.toList());
        return mallOrderItemDAO.insertBatch(mallOrderItemDOS);
    }

    public List<MallOrderItemDTO> selectByOrderId(Integer orderId) {
        List<MallOrderItemDO>  mallOrderItemDOS = mallOrderItemDAO.selectByOrderId(orderId);
        if (mallOrderItemDOS == null) {
            return new ArrayList<>();
        }
        return mallOrderItemDOS.stream().map(MallOrderItemConverter::do2dto).collect(Collectors.toList());
    }

    public List<MallOrderItemDTO> selectByOrderIds(List<Integer> orderIds) {
        List<MallOrderItemDO> mallOrderItemDOS = mallOrderItemDAO.selectByOrderIds(orderIds);
        if (mallOrderItemDOS == null) {
            return new ArrayList<>();
        }
        return mallOrderItemDOS.stream().map(MallOrderItemConverter::do2dto).collect(Collectors.toList());
    }

}
