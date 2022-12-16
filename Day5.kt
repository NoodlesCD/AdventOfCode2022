fun dayFive() {
    val s1 : ArrayDeque<Char> = ArrayDeque<Char>()
    val s2 : ArrayDeque<Char> = ArrayDeque<Char>()
    val s3 : ArrayDeque<Char> = ArrayDeque<Char>()
    val s4 : ArrayDeque<Char> = ArrayDeque<Char>()
    val s5 : ArrayDeque<Char> = ArrayDeque<Char>()
    val s6 : ArrayDeque<Char> = ArrayDeque<Char>()
    val s7 : ArrayDeque<Char> = ArrayDeque<Char>()
    val s8 : ArrayDeque<Char> = ArrayDeque<Char>()
    val s9 : ArrayDeque<Char> = ArrayDeque<Char>()

    val stacks : MutableList<ArrayDeque<Char>> = mutableListOf(s1, s2, s3, s4, s5, s6, s7, s8, s9)
    var instructions = false

    File("./src/main/resources/Day5.txt").useLines { lines -> lines.forEach {
        if (it.isBlank()) {
            instructions = true
            return@forEach
        }
        if (it[1] == '1') return@forEach

        if (!instructions) {
            val cubes = it.chunked(4)
            for (i in cubes.indices) {
                if (cubes[i][1] != ' ') stacks[i].addLast(cubes[i][1])
            }
        } else {
            val moves = it.split("move ", " from ", " to ")
            val from = stacks[moves[2].toInt() - 1]
            val to = stacks[moves[3].toInt() - 1]

            for (i in 1..moves[1].toInt()) {
                to.addFirst(from.removeFirst())
            }
        }
    }}

    print("Day Five - ")
    for (stack in stacks) {
        print(stack.first())
    }
}

fun dayFiveP2() {
    val s1 : ArrayDeque<Char> = ArrayDeque<Char>()
    val s2 : ArrayDeque<Char> = ArrayDeque<Char>()
    val s3 : ArrayDeque<Char> = ArrayDeque<Char>()
    val s4 : ArrayDeque<Char> = ArrayDeque<Char>()
    val s5 : ArrayDeque<Char> = ArrayDeque<Char>()
    val s6 : ArrayDeque<Char> = ArrayDeque<Char>()
    val s7 : ArrayDeque<Char> = ArrayDeque<Char>()
    val s8 : ArrayDeque<Char> = ArrayDeque<Char>()
    val s9 : ArrayDeque<Char> = ArrayDeque<Char>()

    val stacks : MutableList<ArrayDeque<Char>> = mutableListOf(s1, s2, s3, s4, s5, s6, s7, s8, s9)
    var instructions = false

    File("./src/main/resources/Day5.txt").useLines { lines -> lines.forEach {
        if (it.isBlank()) {
            instructions = true
            return@forEach
        }
        if (it[1] == '1') return@forEach

        if (!instructions) {
            val cubes = it.chunked(4)
            for (i in cubes.indices) {
                if (cubes[i][1] != ' ') stacks[i].addLast(cubes[i][1])
            }
        } else {
            val moves = it.split("move ", " from ", " to ")
            val from = stacks[moves[2].toInt() - 1]
            val to = stacks[moves[3].toInt() - 1]
            val moving : ArrayDeque<Char> = ArrayDeque<Char>()

            for (i in 1..moves[1].toInt()) {
                moving.addFirst(from.removeFirst())
            }
            for (i in moving.indices) {
                to.addFirst(moving.removeFirst())
            }
        }
    }}

    print("Day Five Part 2 - ")
    for (stack in stacks) {
        print(stack.first())
    }
}
