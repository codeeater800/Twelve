package com.twelve;
import android.util.Log;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.saranyu.instashortssdk.InstaShortsView;
import com.saranyu.instashortssdk.VideoData;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;




public class Media extends ReactContextBaseJavaModule {

  List<VideoData> videoList = new ArrayList<>();
  //  videoList.add(new VideoData("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4", "1"));
  //  videoList.add(new VideoData("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4", "2"));
  //  videoList.add(new VideoData("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerBlazes.mp4", "3"));

  List<com.saranyu.instashortssdk.VideoData> sdkVideoDataList = new ArrayList<>();
  //  for (VideoData video : videoList) {
        VideoData sdkVideo = new VideoData(
                  1,
                  "https://d37j45vkt3c280.cloudfront.net/transcoding-videos/62f1eb418530b8bb03e2bb5f/main_playlist.m3u8",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.",
                "F1 on tenterhooks: History for Lewis Hamilton or victory for Max Verstappen, we will see in Italian Grand Prix Commonwealth Games 2022 Live Day 6: Weightlifter Lovepreet Singh eyes gold",
                9999,
                1500,
                1500,
                "",
                false,
                "dwdwdwd",
                "",
                "https://images.pexels.com/photos/1459505/pexels-photo-1459505.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
                "video",
                false
        );


        //sdkVideoDataList.add(sdkVideo);
       // InstaShortsView sdkobj = new InstaShortsView(Objects.requireNonNull(getCurrentActivity()));


    Media(ReactApplicationContext reactContext) {
        super(reactContext);

    }

    @ReactMethod
    public void MediaCall() {

        sdkVideoDataList.add(sdkVideo);
        InstaShortsView sdkobj = new InstaShortsView(Objects.requireNonNull(getCurrentActivity()));


        InstaShortsView med = new InstaShortsView(Objects.requireNonNull(getCurrentActivity()));

        med.setMediaData(sdkVideoDataList);
        Log.d("hi", "test");
    }

    @NonNull
    @Override
    public String getName() {
        return "Media";
    }
}
