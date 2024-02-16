package com.mika.book.model;


import lombok.Data;

@Data
public class Result<T> {
    private int code;// 后端响应状态，业务状态码 200-成功 -1失败，-2表示未登录
    private String errmsg;// 后端发生错误的原因
    private T data;

    /**
     * 成功时
     */
    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<>();
        result.setData(data);
        result.setCode(200);
        return result;
    }

    /**
     * 失败时
     */
    public static <T> Result<T> fail(T data, String errMsg) {
        Result<T> result = new Result<>();
        result.setData(data);
        result.setCode(-1);
        result.setErrmsg(errMsg);
        return result;
    }

    public static <T> Result<T> fail(String errMsg) {
        Result<T> result = new Result<>();
        result.setCode(-1);
        result.setErrmsg(errMsg);
        return result;
    }

    /**
     * 未登录
     */
    public static <T> Result<T> unlogin() {
        Result<T> result = new Result<>();
        result.setCode(-2);
        result.setErrmsg("用户未登录");
        return result;
    }

}
