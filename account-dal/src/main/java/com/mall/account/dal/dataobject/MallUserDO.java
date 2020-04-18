package com.mall.account.dal.dataobject;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class MallUserDO {

    private Integer id;

    private String nickName;

    private String loginName;

    private String passwordMd5;

    private String introduceSign;

    private String address;

    private Integer isDeleted;

    private Integer lockedFlag;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;


}
