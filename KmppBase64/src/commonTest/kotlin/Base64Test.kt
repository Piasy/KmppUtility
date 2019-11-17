import com.piasy.base64.Base64Factory

import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * Created by Piasy{github.com/Piasy} on 2019/11/17.
 */
open class Base64Test {
    private val encoder = Base64Factory.createEncoder()
    private val decoder = Base64Factory.createDecoder()

    @Test
    fun testEncodeString() {
        assertEquals("S290bGluIGlzIGF3ZXNvbWU=", encoder.encodeString("Kotlin is awesome"))
    }

    @Test
    fun testDecodeString() {
        assertEquals("Kotlin is awesome", decoder.decodeString("S290bGluIGlzIGF3ZXNvbWU="))
    }
}
