fun dayThree() {
    var prioritySum = 0

    File("./src/main/resources/Day3.txt").useLines { lines -> lines.forEach {
        val first = it.substring(0, it.length / 2)
        val second = it.substring(it.length / 2)

        for (char in second) {
            if (!first.contains(char)) continue

            prioritySum += if (char.isUpperCase()) {
                char.code - 38
            } else {
                char.code - 96
            }
            break
        }
    }}

    println("Day 3 -- $prioritySum")
}

fun dayThreeP2() {
    var prioritySum = 0
    val group : MutableList<String> = mutableListOf("", "", "")

    File("./src/main/resources/Day3.txt").useLines { lines -> lines.forEachIndexed { index, it ->
        group[index % 3] = it
        if (index % 3 == 2) {
            for (char in group[0]) {
                if (!group[1].contains(char) || !group[2].contains(char)) continue

                prioritySum += if (char.isUpperCase()) {
                    char.code - 38
                } else {
                    char.code - 96
                }
                break
            }
        }
    }}

    println("Day 3 Part 2 -- $prioritySum")
}
