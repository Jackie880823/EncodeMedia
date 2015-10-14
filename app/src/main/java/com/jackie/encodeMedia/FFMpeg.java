package com.jackie.encodeMedia;

/**
 * Created by Jackie on 9/10/15.
 *
 * @author Jackie
 * @version 1.0
 */
public class FFmpeg {

    static {
        System.loadLibrary("avutil-54");
        System.loadLibrary("swresample-1");
        System.loadLibrary("avcodec-56");
        System.loadLibrary("avformat-56");
        System.loadLibrary("swscale-3");
        System.loadLibrary("postproc-53");
        System.loadLibrary("avfilter-5");
        System.loadLibrary("avdevice-56");
        System.loadLibrary("sfftranscoder");
    }

    public native int ffmpegcore(int argc,String[] argv);
}
