package com.twelve;
import androidx.annotation.NonNull;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.saranyu.instashortssdk.InstaShortsView;

import java.util.Map;
import java.util.HashMap;
import android.util.Log;


public class Version extends ReactContextBaseJavaModule{
    Version(ReactApplicationContext context) {
        super(context);
    }

    @ReactMethod
    public void getVersion() {

        Log.d("Version", "React Native AppVersion 1.0");
    }
    
    @NonNull
    @Override
    public String getName() {
        return "Version";
    }


}

