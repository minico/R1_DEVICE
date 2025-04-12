//
// Decompiled by Jadx - 523ms
//
package com.unisound.vui.transport.out;

import com.alibaba.fastjson.annotation.JSONField;
import com.google.gson.annotations.SerializedName;

public class OptionContent {

    @SerializedName("optionKey")
    @JSONField(name = "optionKey")
    private String optionKey;

    @SerializedName("optionValue")
    @JSONField(name = "optionValue")
    private Object optionValue;

    public OptionContent() {
    }

    public OptionContent(String str, Object obj) {
        this.optionKey = str;
        this.optionValue = obj;
    }

    public String getOptionKey() {
        return this.optionKey;
    }

    public Object getOptionValue() {
        return this.optionValue;
    }

    public void setOptionKey(String str) {
        this.optionKey = str;
    }

    public void setOptionValue(Object obj) {
        this.optionValue = obj;
    }
}
