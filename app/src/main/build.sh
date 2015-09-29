#!/usr/bin/env bash
echo start build ndk
ndk-build
echo remove *.so lib from jni fo
rm -rvf jni/**/*.so
echo move *.so lib to jni folder
mv libs/* jni/
echo build ndk was end