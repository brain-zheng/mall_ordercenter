package com.mall.ordercenter.service.manager;

import com.mall.common.service.util.PageResult;
import com.mall.ordercenter.client.dto.MallOrderDTO;
import com.mall.ordercenter.client.dto.QueryOrderDTO;
import com.mall.ordercenter.client.service.MallOrderService;
import com.mall.ordercenter.dal.dao.MallOrderDAO;
import com.mall.ordercenter.dal.dataobject.MallOrderDO;
import com.mall.ordercenter.service.converter.MallOrderConverter;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class MallOrderManager {

    @Resource
    private MallOrderDAO mallOrderDAO;

    public int insertSelective(MallOrderDTO record) {
        MallOrderDO mallOrderDO = MallOrderConverter.dto2do(record);
        return mallOrderDAO.insertSelective(mallOrderDO);
    }

    public MallOrderDTO selectByOrderNo(String orderNo) {
        MallOrderDO mallOrderDO = mallOrderDAO.selectByOrderNo(orderNo);
        return  MallOrderConverter.do2dto(mallOrderDO);
    }

    public int getTotalNewBeeMallOrders(QueryOrderDTO queryOrderDTO) {
        return mallOrderDAO.getTotalNewBeeMallOrders(queryOrderDTO);
    }

    public List<MallOrderDTO> findNewBeeMallOrderList(QueryOrderDTO queryOrderDTO) {
        List<MallOrderDO> mallOrderDOS = mallOrderDAO.findNewBeeMallOrderList(queryOrderDTO);
        if (mallOrderDOS ==  null) {
            return new ArrayList<>();
        }
        return mallOrderDOS.stream().map(MallOrderConverter::do2dto).collect(Collectors.toList());
    }

    public int closeOrder(List<Integer> orderIds, int orderStatus) {
        return mallOrderDAO.closeOrder(orderIds, orderStatus);
    }

    public int updateByPrimaryKeySelective(MallOrderDTO record) {
        MallOrderDO mallOrderDO = MallOrderConverter.dto2do(record);
        return mallOrderDAO.updateByPrimaryKeySelective(mallOrderDO);
    }

    public MallOrderDTO selectByPrimaryKey(Integer orderId) {
        MallOrderDO mallOrderDO = mallOrderDAO.selectByPrimaryKey(orderId);
        return MallOrderConverter.do2dto(mallOrderDO);
    }

    public int checkDone(List<Integer> asList) {
        return mallOrderDAO.checkDone(asList);
    }

    public int checkOut(List<Integer> asList) {
        return mallOrderDAO.checkOut(asList);
    }

}
