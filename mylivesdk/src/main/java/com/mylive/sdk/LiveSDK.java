package com.pimpa.pimpagolive;

import android.content.Context;
import android.view.SurfaceView;

import com.pedro.rtplibrary.rtmp.RtmpCamera1;

public class LiveSDK {

    private RtmpCamera1 camera;

    public LiveSDK(Context ctx, SurfaceView surface) {
        camera = new RtmpCamera1(surface, ctx);
    }

    public void startPreview() {
        camera.startPreview();
    }

    public void startStream(String url) {
        camera.startStream(url);
    }

    public void stopStream() {
        camera.stopStream();
    }
}
