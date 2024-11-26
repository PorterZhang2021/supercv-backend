package com.xzgedu.supercv.advice;

import com.xzgedu.supercv.common.exception.ErrorCode;
import lombok.Data;

@Data
public class ResponseData<T> {
    private int code;
    private String msg;
    private T data;

    public ResponseData(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static ResponseData create(ErrorCode errorCode) {
        return new ResponseData(errorCode.getCode(), errorCode.getMsg());
    }

    public ResponseData data(T data)  {
        this.data = data;
        return this;
    }

    public ResponseData data() {
        return this;
    }
}