import org.junit.Test
import kotlin.test.assertEquals

/**
 * @author pawegio
 */
class Day1Test {

    @Test
    fun `sum all changes`() {
        val changes = sequenceOf(1, 2, 3)
        assertEquals(6, getResultingFrequency(changes))
    }

    @Test
    fun `subtract changes with minus sign`() {
        val changes = sequenceOf(1, -2, -3)
        assertEquals(-4, getResultingFrequency(changes))
    }

    @Test
    fun `get first frequency reached twice`() {
        listOf(
            sequenceOf(1, -1) to 0,
            sequenceOf(3, 3, 4, -2, -4) to 10,
            sequenceOf(-6, 3, 8, 5, -6) to 5,
            sequenceOf(7, 7, -2, -7, -4) to 14
        ).forEach { (changes, expected) ->
            assertEquals(expected, getFirstFrequencyReachedTwice(changes))
        }
    }
}
