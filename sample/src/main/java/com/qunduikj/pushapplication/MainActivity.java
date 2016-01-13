package com.qunduikj.pushapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.igexin.sdk.PushManager;

public class MainActivity extends Activity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PushManager.getInstance().initialize(getApplicationContext());

        String clientId =  PushManager.getInstance().getClientid(this);

        Log.e(TAG, "Client Id:" + clientId);
    }

}
