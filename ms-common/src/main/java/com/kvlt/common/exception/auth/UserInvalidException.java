package com.kvlt.common.exception.auth;

import com.kvlt.common.constant.CommonConstants;
import com.kvlt.common.exception.BaseException;

public class UserInvalidException extends BaseException {
    public UserInvalidException(String message) {
        super(message, CommonConstants.EX_USER_PASS_INVALID_CODE);
    }
}
