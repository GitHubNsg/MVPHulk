package com.madreain.mvphulk.module.CustomRefresh;

import android.support.annotation.Keep;

/**
 * @author madreain
 * @date 2019/2/20.
 * module：
 * description：
 */
@Keep
public class CustomRefreshListData {
    private String code;
    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
