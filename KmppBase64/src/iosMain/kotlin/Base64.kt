package com.piasy.base64

/**
 * Created by Piasy{github.com/Piasy} on 2019/11/17.
 */

actual object Base64Factory {
    actual fun createEncoder(): Base64Encoder = NativeBase64Encoder

    actual fun createDecoder(): Base64Decoder = NativeBase64Decoder
}

object NativeBase64Encoder : Base64Encoder {
    override fun encodeString(src: String): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

object NativeBase64Decoder : Base64Decoder {
    override fun decodeString(src: String): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
