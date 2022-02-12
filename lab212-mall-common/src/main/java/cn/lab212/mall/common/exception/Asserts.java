package cn.lab212.mall.common.exception;

import cn.lab212.mall.common.api.IErrorCode;

/**
 * @author yinck
 * @version 1.0
 * @date 2021-01-14 13:05
 */
public class Asserts {

    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(IErrorCode errorCode) {
        throw new ApiException(errorCode);
    }
}
