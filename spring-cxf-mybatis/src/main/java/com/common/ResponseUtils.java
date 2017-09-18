package com.common;


import com.common.commonVo.ResponseVo;


public class ResponseUtils {
    public static ResponseVo response(Integer code, Object data) {
        return new ResponseVo(code, data);
    }

    public static ResponseVo responseError(Integer code, String msg) {
        return new ResponseVo(code, msg);
    }

    public static ResponseVo notFound() {
        return new ResponseVo(404);
    }

    public static ResponseVo success(Object data) {
        return new ResponseVo(200, data, null);
    }

    public static ResponseVo success() {
        return new ResponseVo(200, null, null);
    }

    public static ResponseVo failure(String msg) {
        return new ResponseVo(500, null, msg);
    }

    public static ResponseVo failure(int code, String msg) {
        return new ResponseVo(code, null, msg);
    }

    public static ResponseVo response(Integer status) {
        return new ResponseVo(status);
    }

    public static ResponseVo unauthorized() {
        return unauthorized(null);
    }

    public static ResponseVo unauthorized(Object data) {
        return new ResponseVo(401, data);
    }


}
