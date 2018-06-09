package com.kvlt.common.exception.auth;

import com.kvlt.common.constant.CommonConstants;
import com.kvlt.common.exception.BaseException;

public class UserTokenException extends BaseException {
    public UserTokenException(String message) {
        super(message, CommonConstants.EX_USER_INVALID_CODE);
    }
}
