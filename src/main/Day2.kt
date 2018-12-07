@file:JvmName("Day2")

import kotlin.system.measureTimeMillis

/**
 * @author pawegio
 */

fun main(args: Array<String>) {
    val input = args.first()
    val ids = input.splitToSequence(' ')
    println(ids.count())

    // Task 1
    val task1Time = measureTimeMillis {
        print("Checksum: ${getChecksum(ids)}")
    }
    println(" (in $task1Time ms)")
}

fun getChecksum(ids: Sequence<String>): Int {
    val counts = ids.map { id -> id.groupingBy { it }.eachCount() }
    println(counts.toList())
    val twos = counts.count { it.containsValue(2) }
    val threes = counts.count { it.containsValue(3) }
    return twos * threes
}
