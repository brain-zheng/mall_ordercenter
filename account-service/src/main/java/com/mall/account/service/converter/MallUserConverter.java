package com.mall.account.service.converter;


import com.mall.account.client.dto.MallUserDTO;
import com.mall.account.dal.dataobject.MallUserDO;

public class MallUserConverter {

    public static MallUserDO mallUserDTO2DO(MallUserDTO userDTO) {
        if (userDTO == null) {
            return null;
        }
        MallUserDO mallUserDO = new MallUserDO();
        mallUserDO.setId(userDTO.getUserId());
        mallUserDO.setNickName(userDTO.getNickName());
        mallUserDO.setLoginName(userDTO.getLoginName());
        mallUserDO.setPasswordMd5(userDTO.getPasswordMd5());
        mallUserDO.setIntroduceSign(userDTO.getIntroduceSign());
        mallUserDO.setAddress(userDTO.getAddress());
        mallUserDO.setIsDeleted(userDTO.getIsDeleted());
        mallUserDO.setLockedFlag(userDTO.getLockedFlag());
        mallUserDO.setCreateTime(userDTO.getCreateTime());
        return mallUserDO;
    }

    public static MallUserDTO mallUserDO2DTO(MallUserDO userDO) {
        if (userDO == null) {
            return null;
        }
        MallUserDTO mallUserDTO = new MallUserDTO();
        mallUserDTO.setUserId(userDO.getId());
        mallUserDTO.setNickName(userDO.getNickName());
        mallUserDTO.setLoginName(userDO.getLoginName());
        mallUserDTO.setPasswordMd5(userDO.getPasswordMd5());
        mallUserDTO.setIntroduceSign(userDO.getIntroduceSign());
        mallUserDTO.setAddress(userDO.getAddress());
        mallUserDTO.setIsDeleted(userDO.getIsDeleted());
        mallUserDTO.setLockedFlag(userDO.getLockedFlag());
        mallUserDTO.setCreateTime(userDO.getCreateTime());
        return mallUserDTO;
    }


}
