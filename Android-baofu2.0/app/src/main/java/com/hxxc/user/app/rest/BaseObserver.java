package com.hxxc.user.app.rest;

/**
 * Created by Administrator on 2016/11/23.
 */

public interface BaseObserver<T> {

    void onSuccess(T t);
    void onFail(String fail);
}
