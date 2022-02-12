package cn.lab212.mall.common.exception;

import cn.lab212.mall.common.api.IErrorCode;

/**
 * @author yinck
 * @version 1.0
 * @date 2021-01-14 12:51
 */
public class ApiException extends RuntimeException {

    private IErrorCode errorCode;

    public ApiException(IErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ApiException(String message) {
        super(message);
    }

    public ApiException(Throwable cause) {
        super(cause);
    }

    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public IErrorCode getErrorCode() {
        return errorCode;
    }
}
