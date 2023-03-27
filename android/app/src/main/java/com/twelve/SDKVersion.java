package com.twelve;

import android.util.Log;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.saranyu.instashortssdk.InstaShortsView;

public class SDKVersion extends ReactContextBaseJavaModule {

    SDKVersion(ReactApplicationContext context) {
        super(context);
    }


    @ReactMethod
    public void VVersion() {
      InstaShortsView res = new InstaShortsView(getReactApplicationContext());
      Log.d("Version", "Version number is" + res.getVersion());
    }
    @NonNull
    @Override
    public String getName() {

        return "SDKVersion";
    }
}
