package com.mall.ordercenter.service.converter;

import com.mall.ordercenter.client.dto.MallOrderDTO;
import com.mall.ordercenter.dal.dataobject.MallOrderDO;

public class MallOrderConverter {

    public static MallOrderDTO do2dto(MallOrderDO orderDO) {
        if (orderDO == null) {
            return null;
        }
        MallOrderDTO mallOrderDTO = new MallOrderDTO();
        mallOrderDTO.setOrderId(orderDO.getOrderId());
        mallOrderDTO.setOrderNo(orderDO.getOrderNo());
        mallOrderDTO.setUserId(orderDO.getUserId());
        mallOrderDTO.setTotalPrice(orderDO.getTotalPrice());
        mallOrderDTO.setPayStatus(orderDO.getPayStatus());
        mallOrderDTO.setPayType(orderDO.getPayType());
        mallOrderDTO.setPayTime(orderDO.getPayTime());
        mallOrderDTO.setOrderStatus(orderDO.getOrderStatus());
        mallOrderDTO.setExtraInfo(orderDO.getExtraInfo());
        mallOrderDTO.setUserAddress(orderDO.getUserAddress());
        mallOrderDTO.setIsDeleted(orderDO.getIsDeleted());
        mallOrderDTO.setCreateTime(orderDO.getCreateTime());
        mallOrderDTO.setUpdateTime(orderDO.getUpdateTime());
        return mallOrderDTO;
    }

    public static MallOrderDO dto2do(MallOrderDTO dto) {
        if (dto == null) {
            return null;
        }
        MallOrderDO mallOrderDO = new MallOrderDO();
        mallOrderDO.setOrderId(dto.getOrderId());
        mallOrderDO.setOrderNo(dto.getOrderNo());
        mallOrderDO.setUserId(dto.getUserId());
        mallOrderDO.setTotalPrice(dto.getTotalPrice());
        mallOrderDO.setPayStatus(dto.getPayStatus());
        mallOrderDO.setPayType(dto.getPayType());
        mallOrderDO.setPayTime(dto.getPayTime());
        mallOrderDO.setOrderStatus(dto.getOrderStatus());
        mallOrderDO.setExtraInfo(dto.getExtraInfo());
        mallOrderDO.setUserAddress(dto.getUserAddress());
        mallOrderDO.setIsDeleted(dto.getIsDeleted());
        mallOrderDO.setCreateTime(dto.getCreateTime());
        mallOrderDO.setUpdateTime(dto.getUpdateTime());
        return mallOrderDO;
    }


}
