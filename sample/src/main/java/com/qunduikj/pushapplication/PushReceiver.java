package com.qunduikj.pushapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.igexin.sdk.PushConsts;

/**
 * Created by wangj on 2016/1/13
 */
public class PushReceiver extends BroadcastReceiver{

    private static final String TAG = PushReceiver.class.getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent) {

        Bundle bundle = intent.getExtras();

        switch (bundle.getInt(PushConsts.CMD_ACTION)){
            case PushConsts.GET_MSG_DATA:  // 自定义透传消息
                byte[] payload = bundle.getByteArray("payload");

                if(payload != null) {
                    String data = new String(payload);
                    Log.e(TAG, "----- data :" + data);
                }
                break;
        }
    }
}
