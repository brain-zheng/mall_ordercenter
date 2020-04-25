package com.mall.ordercenter.client.service;

import com.mall.ordercenter.client.dto.MallShoppingCartItemDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShoppingCartService {

    MallShoppingCartItemDTO selectByUserIdAndGoodsId(Integer mallUserId, Integer goodsId);

    MallShoppingCartItemDTO selectByPrimaryKey(Integer cartItemId);

    List<MallShoppingCartItemDTO> selectByUserId(Integer mallUserId, Integer number);

    Integer updateByPrimaryKeySelective(MallShoppingCartItemDTO mallShoppingCartItemDTO);

    Integer selectCountByUserId(Integer mallUserId);

    Integer insertSelective(MallShoppingCartItemDTO mallShoppingCartItemDTO);

    Integer deleteByPrimaryKey(Integer cartItemId);

    Integer deleteBatch(List<Integer> ids);

}
