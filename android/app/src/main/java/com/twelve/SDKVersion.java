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


 //   private static ReactApplicationContext reactContext;
     SDKVersion(ReactApplicationContext reactContext) {
        super(reactContext);
   //     reactContext = context;

     }


    @ReactMethod
    public void VVersion() {
      InstaShortsView res = new InstaShortsView(Objects.requireNonNull(getCurrentActivity()));
    //  Activity activity = new Activity();
      Log.d("Version", "Version number is " + res.getVersion());
    }

    @NonNull
    @Override
    public String getName() {

        return "SDKVersion";
    }

   // private static final String ERROR_NO_ACTIVITY = "no activity";
 //   private static final String ERROR_NO_ACTIVITY_MESSAGE = "not attached to an activity";

  //  @ReactMethod
   // public void testActivity(successCallBack, errorCallBack) {
  //      final Activity activity = getCurrentActivity();

  //      if (activity == null) {
  //          errorCallback(ERROR_NO_ACTIVITY, ERROR_NO_ACTIVITY_MESSAGE);
      //  }
 //   }


}
