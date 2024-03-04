package com.mika.blog.model;

import com.mika.blog.constants.Constant;
import lombok.Data;

@Data
public class Result {
    private Integer code;// 200成功 -1失败 -2未登录
    private String errMsg;
    private Object data;

    public static Result success(Object data) {
        Result result = new Result();
        result.setCode(Constant.SUCCESS_CODE);
        result.setErrMsg("");
        result.setData(data);
        return result;
    }

    public static Result fail(String errMsg, Object data) {
        Result result = new Result();
        result.setCode(Constant.FAIL_CODE);
        result.setErrMsg(errMsg);
        result.setData(data);
        return result;
    }

    public static Result fail(String errMsg) {
        Result result = new Result();
        result.setCode(Constant.FAIL_CODE);
        result.setErrMsg(errMsg);
        result.setData(null);
        return result;
    }

    public static Result unlogin() {
        Result result = new Result();
        result.setCode(Constant.UNLOGIN_CODE);
        result.setErrMsg("用户未登录");
        return result;
    }
}
