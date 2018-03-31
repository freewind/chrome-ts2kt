package example

import kotlin.test.*

class HelloTest {

    @Test
    fun testHello() {
        assertEquals(hello("you"), "Hello, you!")
    }

}