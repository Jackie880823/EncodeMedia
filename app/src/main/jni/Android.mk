LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

FFMPEG_PATH = ../../../../FFmpeg/android/arm

LOCAL_MODULE    := ffmpeg

LOCAL_C_INCLUDES := $(LOCAL_PATH)/$(FFMPEG_PATH)/include

LOCAL_SRC_FILES := ffmpeg.c
LOCAL_LDLIBS := -llog -ljnigraphics -lz -landroid
LOCAL_SHARED_LIBRARIES := libavformat libavcodec libswscale libavutil libavfilter libwsresample

include $(BUILD_SHARED_LIBRARY)
$(call import-module, FFmpeg/android/arm)