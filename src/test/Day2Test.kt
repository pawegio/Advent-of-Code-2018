import org.junit.Assert.assertEquals
import org.junit.Test

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

    @Test
    fun `get common letters`() {
        val ids = sequenceOf(
            "abcde",
            "fghij",
            "klmno",
            "pqrst",
            "fguij",
            "axcye",
            "wvxyz"
        )
        assertEquals("fgij", getCommonLetters(ids))
    }
}
