//
// Decompiled by Jadx - 559ms
//
package com.unisound.vui.transport.out;

import com.alibaba.fastjson.annotation.JSONField;
import com.google.gson.annotations.SerializedName;
import com.unisound.vui.auth.BasicCredentials;
import com.unisound.vui.bootstrap.ANTELocalConfiguration;
import com.unisound.vui.engine.ANTEngineOption;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SdkCreatorInfo {

    @SerializedName("credentials")
    @JSONField(name = "credentials")
    private BasicCredentials credentials;

    @SerializedName("engineOption")
    @JSONField(name = "engineOption")
    private Map<String, Object> engineOption;

    @SerializedName("localConfiguration")
    @JSONField(name = "localConfiguration")
    private ANTELocalConfiguration localConfiguration;

    @SerializedName("mainVocab")
    @JSONField(name = "mainVocab")
    private Map<String, List<String>> mainVocab;

    @SerializedName("maintag")
    @JSONField(name = "maintag")
    private String maintag;

    @SerializedName("wakeupWord")
    @JSONField(name = "wakeupWord")
    private List<String> wakeupWord;

    public BasicCredentials getCredentials() {
        return this.credentials;
    }

    public Map<String, Object> getEngineOption() {
        return this.engineOption;
    }

    public ANTELocalConfiguration getLocalConfiguration() {
        return this.localConfiguration;
    }

    public Map<String, List<String>> getMainVocab() {
        return this.mainVocab;
    }

    public String getMaintag() {
        return this.maintag;
    }

    public List<String> getWakeupWord() {
        return this.wakeupWord;
    }

    public Map<String, Object> parseFromANTEngineOption(Map<ANTEngineOption<?>, Object> map) {
        HashMap hashMap = new HashMap();
        for (ANTEngineOption<?> aNTEngineOption : map.keySet()) {
            hashMap.put(aNTEngineOption.name(), map.get(aNTEngineOption));
        }
        return hashMap;
    }

    public void setCredentials(BasicCredentials basicCredentials) {
        this.credentials = basicCredentials;
    }

    public void setEngineOption(Map<String, Object> map) {
        this.engineOption = map;
    }

    public void setLocalConfiguration(ANTELocalConfiguration aNTELocalConfiguration) {
        this.localConfiguration = aNTELocalConfiguration;
    }

    public void setMainVocab(Map<String, List<String>> map) {
        this.mainVocab = map;
    }

    public void setMaintag(String str) {
        this.maintag = str;
    }

    public void setWakeupWord(List<String> list) {
        this.wakeupWord = list;
    }

    public Map<ANTEngineOption<?>, Object> toANTEngineOption(Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        for (String str : map.keySet()) {
            hashMap.put(ANTEngineOption.valueOf(str), map.get(str));
        }
        return hashMap;
    }
}
