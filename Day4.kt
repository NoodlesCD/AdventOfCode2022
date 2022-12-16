fun dayFour() {
    var pairs = 0

    File("./src/main/resources/Day4.txt").useLines { lines -> lines.forEach {
        val splits = it.split(',', '-', ignoreCase = false, limit = 0)
        val elf1Range = Pair(splits[0].toInt(), splits[1].toInt())
        val elf2Range = Pair(splits[2].toInt(), splits[3].toInt())

        val elf1Contained = elf1Range.first >= elf2Range.first && elf1Range.second <= elf2Range.second
        val elf2Contained = elf2Range.first >= elf1Range.first && elf2Range.second <= elf1Range.second

        if (elf1Contained || elf2Contained) {
            pairs++
        }
    }}

    println("Day 4 -- $pairs")
}

fun dayFourP2() {
    var pairs = 0

    File("./src/main/resources/Day4.txt").useLines { lines -> lines.forEach {
        val splits = it.split(',', '-', ignoreCase = false, limit = 0)
        val elf1Range = Pair(splits[0].toInt(), splits[1].toInt())
        val elf2Range = Pair(splits[2].toInt(), splits[3].toInt())

        val elfContained = elf2Range.first >= elf1Range.first && elf2Range.first <= elf1Range.second
        val elf2Contained = elf1Range.first >= elf2Range.first && elf1Range.first <= elf2Range.second

        if (elfContained || elf2Contained) {
            pairs++
        }
    }}

    println("Day 4 Part 2 -- $pairs")
}
