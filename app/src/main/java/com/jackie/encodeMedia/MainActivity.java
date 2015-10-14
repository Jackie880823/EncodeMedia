package com.jackie.encodeMedia;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called after {@link #onRestoreInstanceState}, {@link #onRestart}, or
     * {@link #onPause}, for your activity to start interacting with the user.
     * This is a good place to begin animations, open exclusive-access devices
     * (such as the camera), etc.
     * <p/>
     * <p>Keep in mind that onResume is not the best indicator that your activity
     * is visible to the user; a system window such as the keyguard may be in
     * front.  Use {@link #onWindowFocusChanged} to know for certain that your
     * activity is visible to the user (for example, to resume a game).
     * <p/>
     * <p><em>Derived classes must call through to the super class's
     * implementation of this method.  If they do not, an exception will be
     * thrown.</em></p>
     *
     * @see #onRestoreInstanceState
     * @see #onRestart
     * @see #onPostResume
     * @see #onPause
     */
    @Override
    protected void onResume() {
        super.onResume();

        final EditText cmdEdittext= (EditText) this.findViewById(R.id.editText_cmd);
        Button startButton= (Button) this.findViewById(R.id.button_start);

        startButton.setOnClickListener(new View.OnClickListener() {
            boolean start = true;
            public void onClick(View arg0) {
                if (start) {
                    String cmdline = cmdEdittext.getText().toString();
                    String[] argv = cmdline.split(" ");
                    Integer argc = argv.length;
                    Log.i(TAG, "onClick& start ffmpegcore: " + cmdline);
                    new FFmpeg().ffmpegcore(argc, argv);
                    Log.i(TAG, "onClick& end ffmpegcore: " + cmdline);
                }
                start = false;
            }
        });
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

}
