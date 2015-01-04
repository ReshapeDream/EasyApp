package com.harreke.easyapp.configs;

import android.content.Context;

import com.harreke.easyapp.requests.IRequestCallback;
import com.harreke.easyapp.requests.IRequestExecutor;
import com.harreke.easyapp.requests.RequestBuilder;
import com.harreke.easyapp.requests.ion.IonHttpExecutor;
import com.koushikdutta.ion.Ion;

/**
 * 由 Harreke（harreke@live.cn） 创建于 2014/08/04
 */
public class RequestExecutorConfig {
    public static void config(Context context) {
    }
    /**
     * 创建一个Http请求执行器
     *
     * 默认使用Volley的Http库
     * 若需要使用其他Http库，请重写该函数
     *
     * @param context
     *         Context
     * @param builder
     *         请求构造器
     * @param callback
     *         请求回调
     *
     * @return Volley Http请求执行器
     */
    public static IRequestExecutor create(Context context, RequestBuilder builder, IRequestCallback<String> callback) {
        //        return new AsyncHttpClientExecutor(context, builder, callback);
        return new IonHttpExecutor(context, builder, callback);
    }
}