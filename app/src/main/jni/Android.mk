LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

FFMPEG_PATH = $(HOME)/Documents/git/EncodeMedia/FFmpeg

LOCAL_MODULE    := ffmpeg_transformer

ARM=arm

LOCAL_C_INCLUDES := $(FFMPEG_PATH)/android/$(ARM)

LOCAL_SRC_FILES := ffmpeg_jni.c ffmpeg.c ffmpeg_opt.c ffmpeg_filter.c cmdutils.c
LOCAL_LDLIBS := -llog -ljnigraphics -lz -landroid
LOCAL_SHARED_LIBRARIES := libavcodec libavdevice libavfilter libavformat libavresample libavutil libpostproc libwsresample libswscale

include $(BUILD_SHARED_LIBRARY)
$(call import-add-path, $(FFMPEG_PATH))
$(call import-module, android/$(ARM))