package com.twelve;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.saranyu.instashortssdk.InstaShortsView;
import com.saranyu.instashortssdk.VideoData;

import java.util.List;

public class InstaShortsViewManager extends SimpleViewManager<InstaShortsView> {
    public static final String REACT_CLASS = "RCTImageView";
    ReactApplicationContext mCallerContext;

    public InstaShortsViewManager(ReactApplicationContext reactContext) {
        mCallerContext = reactContext;
    }

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @NonNull
    @Override
    protected InstaShortsView createViewInstance(@NonNull ThemedReactContext themedReactContext) {
        return new InstaShortsView(themedReactContext);
    }

    @ReactProp(name="setVideoFeed")
    public void setVideoFeed(InstaShortsView instaShortsView, List<VideoData> videoDataList){
        instaShortsView.setMediaData(videoDataList);
    }

    @ReactProp(name="prepare")
    public void prepareSDK(InstaShortsView instaShortsView){
        instaShortsView.prepare();
    }
}
