package com.unisound.ant.device.netmodule;

import androidx.annotation.WorkerThread;
import com.unisound.ant.device.bean.RequestInfo;
import com.unisound.vui.common.config.ANTConfigPreference;
import com.unisound.vui.util.HttpUtils;
import com.unisound.vui.util.JsonTool;
import com.unisound.vui.util.LogMgr;
import java.io.IOException;
import okhttp3.Response;
import org.json.JSONObject;

public class DeviceInfoUtils {
    private static final String TAG = DeviceInfoUtils.class.getSimpleName();

    @WorkerThread
    public static boolean isDeviceBounded(String udid) throws Exception {
        return true;
    }
}
