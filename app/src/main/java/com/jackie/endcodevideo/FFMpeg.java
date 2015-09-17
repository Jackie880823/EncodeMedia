package com.jackie.endcodevideo;

/**
 * Created by Jackie on 9/10/15.
 *
 * @author Jackie
 * @version 1.0
 */
public class FFMpeg {

//    private static native int naInit(String pFileName);
//
//    private static native int[] naGetVideoRes();
//
//    private static native void naSetSurface(Surface pSurface);
//
//    private static native int naSetup(int pWidth, int pHeight);
//
//    private static native void naPlay();
//
//    private static native void naStop();

    static {
        System.loadLibrary("avutil-55");
        System.loadLibrary("avcodec-57");
        System.loadLibrary("avformat-57");
        System.loadLibrary("swscale-4");
        System.loadLibrary("ffmpeg");
    }

//    public static int init(String fileName) {
//        return naInit(fileName);
//    }
//
//    public static int[] getVideoRes(){
//        return naGetVideoRes();
//    }
//
//    public static int setUp(int width, int height){
//        return naSetup(width, height);
//    }
//
//    public static void play(){
//        naPlay();
//    }
//
//    public static void stop(){
//        naStop();
//    }

    private static native int nFindDecoder(int codecId);
    public static int findDecoder(int codecId){
        return nFindDecoder(codecId);
    }
}
