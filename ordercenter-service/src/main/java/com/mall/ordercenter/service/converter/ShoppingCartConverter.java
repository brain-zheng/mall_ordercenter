package com.mall.ordercenter.service.converter;

import com.mall.ordercenter.client.dto.MallShoppingCartItemDTO;
import com.mall.ordercenter.dal.dataobject.MallShoppingCartItemDO;

public class ShoppingCartConverter {

    public static MallShoppingCartItemDTO do2dto(MallShoppingCartItemDO itemDO) {
        if (itemDO == null) {
            return null;
        }
        MallShoppingCartItemDTO mallShoppingCartItemDTO = new MallShoppingCartItemDTO();
        mallShoppingCartItemDTO.setCartItemId(itemDO.getCartItemId());
        mallShoppingCartItemDTO.setUserId(itemDO.getUserId());
        mallShoppingCartItemDTO.setGoodsId(itemDO.getGoodsId());
        mallShoppingCartItemDTO.setGoodsCount(itemDO.getGoodsCount());
        mallShoppingCartItemDTO.setIsDeleted(itemDO.getIsDeleted());
        mallShoppingCartItemDTO.setCreateTime(itemDO.getCreateTime());
        mallShoppingCartItemDTO.setUpdateTime(itemDO.getUpdateTime());
        return mallShoppingCartItemDTO;
    }

    public static MallShoppingCartItemDO dto2do(MallShoppingCartItemDTO dto) {
        if (dto == null) {
            return null;
        }
        MallShoppingCartItemDO mallShoppingCartItemDO = new MallShoppingCartItemDO();
        mallShoppingCartItemDO.setCartItemId(dto.getCartItemId());
        mallShoppingCartItemDO.setUserId(dto.getUserId());
        mallShoppingCartItemDO.setGoodsId(dto.getGoodsId());
        mallShoppingCartItemDO.setGoodsCount(dto.getGoodsCount());
        mallShoppingCartItemDO.setIsDeleted(dto.getIsDeleted());
        mallShoppingCartItemDO.setCreateTime(dto.getCreateTime());
        mallShoppingCartItemDO.setUpdateTime(dto.getUpdateTime());
        return mallShoppingCartItemDO;
    }

}
