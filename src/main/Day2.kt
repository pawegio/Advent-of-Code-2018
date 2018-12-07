@file:JvmName("Day2")

import kotlin.system.measureTimeMillis

/**
 * @author pawegio
 */

fun main(args: Array<String>) {
    val input = args.first()
    val ids = input.splitToSequence(' ')

    // Task 1
    val task1Time = measureTimeMillis {
        print("Checksum: ${getChecksum(ids)}")
    }
    println(" (in $task1Time ms)")

    // Task 2
    val task2Time = measureTimeMillis {
        print("Common letters: ${getCommonLetters(ids)}")
    }
    println(" (in $task2Time ms)")
}

fun getChecksum(ids: Sequence<String>): Int {
    val counts = ids.map { id -> id.groupingBy { it }.eachCount() }
    println(counts.toList())
    val twos = counts.count { it.containsValue(2) }
    val threes = counts.count { it.containsValue(3) }
    return twos * threes
}

fun getCommonLetters(ids: Sequence<String>): String? {
    for (id1 in ids) for (id2 in ids) {
        if ((id1 to id2).differByOneLetter()) {
            return (id1 to id2).getCommonLetters()
        }
    }
    return null
}

private fun Pair<String, String>.differByOneLetter(): Boolean {
    var difference = 0
    for (i in first.indices) {
        if (first[i] != second[i]) difference++
    }
    return difference == 1
}

private fun Pair<String, String>.getCommonLetters() = buildString {
    for (i in first.indices) {
        if (first[i] == second[i]) append(first[i])
    }
}
