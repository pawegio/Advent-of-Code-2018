import org.junit.Test

import org.junit.Assert.*

/**
 * @author pawegio
 */
class Day2Test {

    @Test
    fun `get checksum`() {
        val ids = sequenceOf(
            "abcdef",
            "bababc",
            "abbcde",
            "abcccd",
            "aabcdd",
            "abcdee",
            "ababab"
        )
        assertEquals(4 * 3, getChecksum(ids))
    }
}