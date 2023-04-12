package com.twelve;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import android.app.Activity;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.saranyu.instashortssdk.InstaShortsView;
import com.facebook.react.bridge.ReactContextBaseJavaModule;

import android.view.WindowManager;
import android.view.Window;
import android.view.View;

import java.util.Objects;


public class SDKVersion extends ReactContextBaseJavaModule {


     SDKVersion(ReactApplicationContext reactContext) {
        super(reactContext);

     }


    @ReactMethod
    public void VVersion() {
      InstaShortsView res = new InstaShortsView(Objects.requireNonNull(getCurrentActivity()));
      Log.d("Version", "Version number is " + res.getVersion());


    }

    @NonNull
    @Override
    public String getName() {

        return "SDKVersion";
    }


}
