package com.mall.ordercenter.service.manager;

import com.mall.ordercenter.client.dto.MallShoppingCartItemDTO;
import com.mall.ordercenter.dal.dao.ShoppingCartDAO;
import com.mall.ordercenter.dal.dataobject.MallShoppingCartItemDO;
import com.mall.ordercenter.service.converter.ShoppingCartConverter;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ShoppingCartManager {

    @Resource
    private ShoppingCartDAO shoppingCartDAO;

    public MallShoppingCartItemDTO selectByUserIdAndGoodsId(Integer mallUserId, Integer goodsId) {
        MallShoppingCartItemDO mallShoppingCartItemDO = shoppingCartDAO.selectByUserIdAndGoodsId(mallUserId, goodsId);
        return ShoppingCartConverter.do2dto(mallShoppingCartItemDO);
    }

    public MallShoppingCartItemDTO selectByPrimaryKey(Integer cartItemId) {
        MallShoppingCartItemDO mallShoppingCartItemDO = shoppingCartDAO.selectByPrimaryKey(cartItemId);
        return ShoppingCartConverter.do2dto(mallShoppingCartItemDO);

    }

    public Integer updateByPrimaryKeySelective(MallShoppingCartItemDTO itemDTO) {
        MallShoppingCartItemDO temp = ShoppingCartConverter.dto2do(itemDTO);
        return shoppingCartDAO.updateByPrimaryKeySelective(temp);
    }

    public Integer selectCountByUserId(Integer mallUserId) {
        return shoppingCartDAO.selectCountByUserId(mallUserId);
    }

    public Integer insertSelective(MallShoppingCartItemDTO mallShoppingCartItemDTO) {
        MallShoppingCartItemDO mallShoppingCartItemDO = ShoppingCartConverter.dto2do(mallShoppingCartItemDTO);
        return shoppingCartDAO.insertSelective(mallShoppingCartItemDO);
    }

    public List<MallShoppingCartItemDTO> selectByUserId(Integer mallUserId, Integer number) {
        List<MallShoppingCartItemDO> mallShoppingCartItemDOS = shoppingCartDAO.selectByUserId(mallUserId, number);
        return mallShoppingCartItemDOS.stream().map(ShoppingCartConverter::do2dto).collect(Collectors.toList());
    }

    public Integer deleteByPrimaryKey(Integer cartItemId) {
        return shoppingCartDAO.deleteByPrimaryKey(cartItemId);
    }

    public Integer deleteBatch(List<Integer> ids) {
        return shoppingCartDAO.deleteBatch(ids);
    }

}
