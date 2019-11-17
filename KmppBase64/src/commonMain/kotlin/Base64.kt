package com.piasy.base64

/**
 * Created by Piasy{github.com/Piasy} on 2019/11/17.
 */
interface Base64Encoder {
    fun encodeString(src: String): String
}

interface Base64Decoder {
    fun decodeString(src: String): String
}

expect object Base64Factory {
    fun createEncoder(): Base64Encoder

    fun createDecoder(): Base64Decoder
}
