#!/bin/zsh

cd NativeBase64/iOS && \
xcodegen && \
xcodebuild clean && \
xcodebuild -quiet -arch arm64 && \
mv ../../libs/NativeBase64/iOS/libNativeBase64.a \
    ../../libs/NativeBase64/iOS/libNativeBase64-arm64.a && \
xcodebuild clean && \
xcodebuild -quiet -arch x86_64 -sdk iphonesimulator13.2 && \
mv ../../libs/NativeBase64/iOS/libNativeBase64.a \
    ../../libs/NativeBase64/iOS/libNativeBase64-x86_64.a && \
lipo -create ../../libs/NativeBase64/iOS/libNativeBase64-arm64.a \
    ../../libs/NativeBase64/iOS/libNativeBase64-x86_64.a \
    -output ../../libs/NativeBase64/iOS/libNativeBase64.a && \
rm -rf ../../libs/NativeBase64/iOS/libNativeBase64-arm64.a \
    ../../libs/NativeBase64/iOS/libNativeBase64-x86_64.a \
    ../../libs/NativeBase64/iOS/include
