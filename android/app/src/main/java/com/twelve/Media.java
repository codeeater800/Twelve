package com.twelve;
import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.saranyu.instashortssdk.InstaShortsView;
import com.saranyu.instashortssdk.VideoData;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;


public class Media extends ReactContextBaseJavaModule {

    Media(ReactApplicationContext reactContext) {
        super(reactContext);

    }

    @ReactMethod
    public void MediaCall() {
        InstaShortsView med = new InstaShortsView(Objects.requireNonNull(getCurrentActivity()));
        //med.setMediaData(@NotNull<VideoData> videoDataList);
        }

    @NonNull
    @Override
    public String getName() {
        return "Media";
    }
}
