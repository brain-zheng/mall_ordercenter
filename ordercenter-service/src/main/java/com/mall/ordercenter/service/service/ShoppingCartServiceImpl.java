package com.mall.ordercenter.service.service;

import com.mall.common.service.util.PageResult;
import com.mall.ordercenter.client.dto.MallShoppingCartItemDTO;
import com.mall.ordercenter.client.service.ShoppingCartService;
import com.mall.ordercenter.service.manager.ShoppingCartManager;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service("ShoppingCartServiceImpl")
public class ShoppingCartServiceImpl implements ShoppingCartService {

    @Resource
    private ShoppingCartManager shoppingCartManager;

    @Override
    public MallShoppingCartItemDTO selectByUserIdAndGoodsId(Integer mallUserId, Integer goodsId) {
        if (mallUserId < 0 || goodsId < 0) {
            return null;
        }
        return shoppingCartManager.selectByUserIdAndGoodsId(mallUserId, goodsId);
    }

    @Override
    public MallShoppingCartItemDTO selectByPrimaryKey(Integer cartItemId) {
        if (cartItemId < 0) {
            return null;
        }
        return shoppingCartManager.selectByPrimaryKey(cartItemId);
    }

    @Override
    public Integer updateByPrimaryKeySelective(MallShoppingCartItemDTO mallShoppingCartItemDTO) {
        if (mallShoppingCartItemDTO == null) {
            return 0;
        }
        return shoppingCartManager.updateByPrimaryKeySelective(mallShoppingCartItemDTO);
    }

    @Override
    public Integer selectCountByUserId(Integer mallUserId) {
        if (mallUserId < 0) {
            return 0;
        }
        return shoppingCartManager.selectCountByUserId(mallUserId);
    }

    @Override
    public Integer insertSelective(MallShoppingCartItemDTO mallShoppingCartItemDTO) {
        if (mallShoppingCartItemDTO == null) {
            return 0;
        }
        return shoppingCartManager.insertSelective(mallShoppingCartItemDTO);
    }

    @Override
    public List<MallShoppingCartItemDTO> selectByUserId(Integer mallUserId, Integer number) {
        if (mallUserId < 0 || number < 0) {
            return new ArrayList<MallShoppingCartItemDTO>();
        }
        return shoppingCartManager.selectByUserId(mallUserId, number);
    }

    @Override
    public Integer deleteByPrimaryKey(Integer cartItemId) {
        if (cartItemId < 0) {
            return 0;
        }
        return shoppingCartManager.deleteByPrimaryKey(cartItemId);
    }

    @Override
    public Integer deleteBatch(List<Integer> ids) {
        if (ids == null || ids.size() == 0) {
            return 0;
        }
        return shoppingCartManager.deleteBatch(ids);
    }
}

