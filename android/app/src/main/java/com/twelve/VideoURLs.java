package com.twelve;

import java.util.ArrayList;
import java.util.List;
import com.saranyu.instashortssdk.InstaShortsView;

public class VideoURLs {
    public static void main(String[] args) {
        List<Video> videoList = new ArrayList<>();
        videoList.add(new Video(1, "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4"));
        videoList.add(new Video(2, "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4"));
        videoList.add(new Video(3, "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerBlazes.mp4"));
    }
}
class Video {
    private final int id;
    private final String url;

    public Video(int id, String url) {
        this.id = id;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }
}

