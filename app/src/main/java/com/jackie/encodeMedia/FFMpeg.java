package com.jackie.encodeMedia;

/**
 * Created by Jackie on 9/10/15.
 *
 * @author Jackie
 * @version 1.0
 */
public class FFmpeg {

    static {
        System.loadLibrary("avcodec-57");
        System.loadLibrary("avdevice-57");
        System.loadLibrary("avfilter-6");
        System.loadLibrary("avformat-57");
        System.loadLibrary("avresample-3");
        System.loadLibrary("avutil-55");
        System.loadLibrary("postproc-54");
        System.loadLibrary("swresample-2");
        System.loadLibrary("swscale-4");
        System.loadLibrary("ffmpeg_transformer");
    }

    public native int ffmpegcore(int argc,String[] argv);
}
