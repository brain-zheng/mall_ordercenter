package com.mall.ordercenter.service.converter;

import com.mall.ordercenter.client.dto.MallOrderDTO;
import com.mall.ordercenter.client.dto.MallOrderItemDTO;
import com.mall.ordercenter.dal.dataobject.MallOrderDO;
import com.mall.ordercenter.dal.dataobject.MallOrderItemDO;

public class MallOrderItemConverter {

    public static MallOrderItemDTO do2dto(MallOrderItemDO mallOrdeItemDO) {
        if (mallOrdeItemDO == null) {
            return null;
        }
        MallOrderItemDTO mallOrderItemDTO = new MallOrderItemDTO();
        mallOrderItemDTO.setOrderItemId(mallOrdeItemDO.getOrderItemId());
        mallOrderItemDTO.setOrderId(mallOrdeItemDO.getOrderId());
        mallOrderItemDTO.setGoodsId(mallOrdeItemDO.getGoodsId());
        mallOrderItemDTO.setGoodsName(mallOrdeItemDO.getGoodsName());
        mallOrderItemDTO.setGoodsCoverImg(mallOrdeItemDO.getGoodsCoverImg());
        mallOrderItemDTO.setSellingPrice(mallOrdeItemDO.getSellingPrice());
        mallOrderItemDTO.setGoodsCount(mallOrdeItemDO.getGoodsCount());
        mallOrderItemDTO.setCreateTime(mallOrdeItemDO.getCreateTime());
        return mallOrderItemDTO;
    }

    public static MallOrderItemDO dto2do(MallOrderItemDTO dto) {
        if (dto == null) {
            return null;
        }
        MallOrderItemDO mallOrderItemDO = new MallOrderItemDO();
        mallOrderItemDO.setOrderItemId(dto.getOrderItemId());
        mallOrderItemDO.setOrderId(dto.getOrderId());
        mallOrderItemDO.setGoodsId(dto.getGoodsId());
        mallOrderItemDO.setGoodsName(dto.getGoodsName());
        mallOrderItemDO.setGoodsCoverImg(dto.getGoodsCoverImg());
        mallOrderItemDO.setSellingPrice(dto.getSellingPrice());
        mallOrderItemDO.setGoodsCount(dto.getGoodsCount());
        mallOrderItemDO.setCreateTime(dto.getCreateTime());
        return mallOrderItemDO;
    }


}
