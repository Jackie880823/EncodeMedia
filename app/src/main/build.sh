#!/usr/bin/env bash
echo start build ndk
ndk-build
echo remove *.so lib from jni fo
rm -rvf jniLibs/**/*.so
echo move *.so lib to jni folder
mv libs/* jniLibs/
echo build ndk was end