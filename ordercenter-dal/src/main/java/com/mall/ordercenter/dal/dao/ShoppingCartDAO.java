package com.mall.ordercenter.dal.dao;

import com.mall.ordercenter.dal.dataobject.MallShoppingCartItemDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShoppingCartDAO {
    Integer deleteByPrimaryKey(Integer cartItemId);

    MallShoppingCartItemDO selectByUserIdAndGoodsId(@Param("mallUserId") Integer mallUserId, @Param("goodsId") Integer goodsId);

    List<MallShoppingCartItemDO> selectByUserId(@Param("mallUserId") Integer mallUserId, @Param("number") Integer number);

    MallShoppingCartItemDO selectByPrimaryKey(Integer cartItemId);

    Integer updateByPrimaryKeySelective(MallShoppingCartItemDO mallShoppingCartItemDO);

    Integer selectCountByUserId(Integer mallUserId);

    Integer insertSelective(MallShoppingCartItemDO record);

    Integer deleteBatch(List<Integer> ids);

}
