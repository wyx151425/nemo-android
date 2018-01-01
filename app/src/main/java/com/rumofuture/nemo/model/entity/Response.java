package com.rumofuture.nemo.model.entity;

import java.io.Serializable;

/**
 * Created by WangZhenqi on 2018/1/1.
 */

public class Response<T> implements Serializable {

    private Integer statusCode;
    private String message;
    private T data;

    public Response() {
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }
}
