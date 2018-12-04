@file:JvmName("Day1")

import kotlin.system.measureTimeMillis

/**
 * @author pawegio
 */

fun main(args: Array<String>) {
    val input = args.first()
    val changes = input.splitToSequence(' ').map(String::toInt)

    // Task 1
    val frequency = getResultingFrequency(changes)
    println("Resulting frequency: $frequency")

    // Task 2
    val task2Time = measureTimeMillis {
        val firstFrequencyReachedTwice = getFirstFrequencyReachedTwice(changes)
        print("First frequency reached twice: $firstFrequencyReachedTwice")
    }
    println(" (in $task2Time ms)")
}

fun getResultingFrequency(changes: Sequence<Int>) = changes.sum()

fun getFirstFrequencyReachedTwice(changes: Sequence<Int>): Int {
    val reached = mutableSetOf(0)
    var result = 0
    loop@while (true) {
        for (change in changes) {
            result += change
            if (!reached.add(result)) break@loop
        }
    }
    return result
}
