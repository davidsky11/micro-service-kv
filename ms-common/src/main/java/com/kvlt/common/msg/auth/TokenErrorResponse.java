package com.kvlt.common.msg.auth;

import com.kvlt.common.constant.RestCodeConstants;
import com.kvlt.common.msg.BaseResponse;

public class TokenErrorResponse extends BaseResponse {
    public TokenErrorResponse(String message) {
        super(RestCodeConstants.TOKEN_ERROR_CODE, message);
    }
}
