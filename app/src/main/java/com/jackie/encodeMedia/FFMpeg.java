package com.jackie.encodeMedia;

/**
 * Created by Jackie on 9/10/15.
 *
 * @author Jackie
 * @version 1.0
 */
public class FFMpeg {

    static {
        System.loadLibrary("avutil-55");
        System.loadLibrary("avcodec-57");
        System.loadLibrary("avformat-57");
        System.loadLibrary("swscale-4");
        System.loadLibrary("ffmpeg");
    }

    public static native void videoDecode(String outputFileName, String inputFileName);
}
