//
// Decompiled by Jadx - 678ms
//
package com.unisound.vui.transport.out;

import com.alibaba.fastjson.annotation.JSONField;
import com.google.gson.annotations.SerializedName;

@Deprecated
public class TTSContent {

    @SerializedName("play_text")
    @JSONField(name = "play_text")
    private String playContent;

    public TTSContent() {
    }

    public TTSContent(String str) {
        this.playContent = str;
    }

    public String getPlayContent() {
        return this.playContent;
    }

    public void setPlayContent(String str) {
        this.playContent = str;
    }
}
