package com.mall.account.client.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class MallUserDTO implements Serializable {

    private Integer userId;

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
