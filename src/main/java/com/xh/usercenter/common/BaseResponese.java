package com.xh.usercenter.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 通用返回类
 * @param <T>
 */
@Data
public class BaseResponese<T> implements Serializable {
    private int code;
    private T data;
    private String message;
    private String description;

    public BaseResponese(int code, T data, String message, String description) {
        this.code = code;
        this.data = data;
        this.message = message;
        this.description = description;
    }

    public BaseResponese(int code, T data, String message) {
        this(code, data, message, "");
    }

    public BaseResponese(int code, T data) {
        this(code, data, "", "");
    }

    public BaseResponese(ErrorCode errorCode){
        this(errorCode.getCode(), null, errorCode.getMessage(), errorCode.getDescription());
    }
}
