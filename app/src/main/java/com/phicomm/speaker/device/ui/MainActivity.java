package com.phicomm.speaker.device.ui;

import android.app.Activity;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.phicomm.speaker.device.R;
import com.unisound.vui.util.LogMgr;

public class MainActivity extends Activity {
    private static final String TAG = "MainActivity";

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LogMgr.d(TAG, "onCreate");
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    public void onResume() {
        super.onResume();
        LogMgr.d(TAG, "onResume");
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        LogMgr.d(TAG, "--->>onDestroy");
        super.onDestroy();
    }
}
