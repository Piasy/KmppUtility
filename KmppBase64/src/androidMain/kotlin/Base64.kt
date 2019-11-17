package com.piasy.base64

import android.util.Base64

/**
 * Created by Piasy{github.com/Piasy} on 2019/11/17.
 */

actual object Base64Factory {
    actual fun createEncoder(): Base64Encoder = AndroidBase64Encoder

    actual fun createDecoder(): Base64Decoder = AndroidBase64Decoder
}

object AndroidBase64Encoder : Base64Encoder {
    override fun encodeString(src: String): String {
        return Base64.encodeToString(src.toByteArray(), Base64.NO_WRAP)
    }
}

object AndroidBase64Decoder : Base64Decoder {
    override fun decodeString(src: String): String {
        return String(Base64.decode(src, Base64.DEFAULT))
    }
}
