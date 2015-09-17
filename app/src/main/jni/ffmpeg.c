#include <math.h>
#include <libavformat/avformat.h>
#include <libavcodec/avcodec.h>

#include "com_jackie_endcodevideo_FFMpeg.h"

#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     cn_dennishucd_FFmpegNative
 * Method:    avcodec_find_decoder
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_com_jackie_endcodevideo_FFMpeg_nFindDecoder
        (JNIEnv *env, jobject obj, jint codecID)
{
  AVCodec *codec = NULL;

  /* register all formats and codecs */
  av_register_all();

  codec = avcodec_find_decoder(codecID);

  if (codec != NULL)
  {
    return 0;
  }
  else
  {
    return -1;
  }
}

#ifdef __cplusplus
}
#endif