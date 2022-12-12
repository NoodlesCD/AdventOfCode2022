fun dayTwo() {
    var points = 0

    File("./src/main/resources/Day2.txt").useLines { lines -> lines.forEach {
        val op = it[0]
        val me = it[2]

        points += when (me) {
            'X' -> 1
            'Y' -> 2
            else -> 3
        }

        if (op.code + 23 == me.code) {
            points += 3
        } else if ((op == 'A' && me == 'Y') || (op == 'B' && me == 'Z') || (op == 'C' && me == 'X')) {
            points += 6
        }
    }}

    println("Day 2 -- $points")
}

fun dayTwoP2() {
    var points = 0

    File("./src/main/resources/Day2.txt").useLines { lines -> lines.forEach {
        val op = it[0]
        val me = it[2]

        val win : Map<Char, Int>  = mapOf('A' to 2, 'B' to 3, 'C' to 1)
        val draw : Map<Char, Int>  = mapOf('A' to 1, 'B' to 2, 'C' to 3)
        val lose : Map<Char, Int>  = mapOf('A' to 3, 'B' to 1, 'C' to 2)

        points += when (it[2]) {
            'X' -> lose[op]!!
            'Y' -> draw[op]!! + 3
            else -> win[op]!! + 6
        }
    }}

    println("Day 2 Part 2 -- $points")
}
