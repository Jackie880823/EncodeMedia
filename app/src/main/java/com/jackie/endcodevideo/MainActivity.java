package com.jackie.endcodevideo;

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
        int id = FFMpeg.findDecoder(1);
        textView.setText("find decoder is: " + id);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

}
