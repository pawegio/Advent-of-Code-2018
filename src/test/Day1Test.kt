import org.junit.Test
import kotlin.test.assertEquals

/**
 * @author pawegio
 */
class Day1Test {

    @Test
    fun `sum all changes`() {
        val changes = sequenceOf("+1", "+2", "+3")
        assertEquals(6, getResultingFrequency(changes))
    }

    @Test
    fun `subtract changes with minus sign`() {
        val changes = sequenceOf("+1", "-2", "-3")
        assertEquals(-4, getResultingFrequency(changes))
    }
}
