package com.xh.usercenter.common;

/**
 * 返回工具类
 */
public class ResultUtils {
    /**
     * 成功
     * @param data
     * @param <T>
     * @return
     */
    public static <T> BaseResponese success(T data){
        return new BaseResponese<>(0, data, "ok");
    }

    /**
     * 失败
     * @param errorCode
     * @return
     */
    public static BaseResponese error(ErrorCode errorCode){
        return new BaseResponese<>(errorCode);
    }

    /**
     * 失败
     * @param errorCode
     * @return
     */
    public static BaseResponese error(ErrorCode errorCode, String message, String description){
        return new BaseResponese<>(errorCode.getCode(), null, message, description);
    }

    /**
     * 失败
     * @param code
     * @param message
     * @param description
     * @return
     */
    public static BaseResponese error(int code, String message, String description){
        return new BaseResponese<>(code, null, message, description);
    }

    /**
     * 失败
     * @param errorCode
     * @param description
     * @return
     */
    public static BaseResponese error(ErrorCode errorCode, String description){
        return new BaseResponese<>(errorCode.getCode(), null, errorCode.getMessage(), description);
    }
}
