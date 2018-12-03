/**
 * @author pawegio
 */

fun main(args: Array<String>) {
    val input = args.first()
    val changes = input.splitToSequence(' ')
    val frequency = getResultingFrequency(changes)
    println("Resulting frequency: $frequency")
}

fun getResultingFrequency(changes: Sequence<String>) =
    changes.sumBy { it.drop(1).toInt() }
