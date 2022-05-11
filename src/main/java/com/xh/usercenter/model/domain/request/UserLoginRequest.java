package com.xh.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求体
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 8596542479948104316L;
    private String userAccount;
    private String userPassword;
}
