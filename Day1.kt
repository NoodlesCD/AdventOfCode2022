fun dayOne() {
    var currentCalories = 0
    var largestCalories = 0

    File("./src/main/resources/Day1.txt").useLines { lines -> lines.forEach {
        if (it.isNotBlank()) {
            currentCalories += it.toInt()
            return@forEach
        }

        if (currentCalories > largestCalories) {
            largestCalories = currentCalories
        }
        currentCalories = 0
    }}

    println("Day 1 -- $largestCalories")
}

fun dayOneP2() {
    var currentCalories = 0
    var largestCalories = 0
    var secondLargest = 0
    var thirdLargest = 0

    File("./src/main/resources/Day1.txt").useLines { lines -> lines.forEach {
        if (it.isNotBlank()) {
            currentCalories += it.toInt()
            return@forEach
        }

        if (currentCalories > largestCalories) {
            thirdLargest = secondLargest
            secondLargest = largestCalories
            largestCalories = currentCalories
        } else if (currentCalories > secondLargest) {
            thirdLargest = secondLargest
            secondLargest = currentCalories
        } else if (currentCalories > thirdLargest) {
            thirdLargest = currentCalories
        }
        currentCalories = 0
    }}

    println("Day 1 Part 2 -- ${largestCalories + secondLargest + thirdLargest}")
}
