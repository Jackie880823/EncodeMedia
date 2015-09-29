package com.jackie.encodeMedia;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends Activity {
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.tv_ffmpeg_info);
        new Thread(){
            @Override
            public void run() {
                super.run();
                FFMpeg.videoDecode("/sdcard/out.mp4", "/sdcard/test.mp4");
            }
        }.start();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

}
