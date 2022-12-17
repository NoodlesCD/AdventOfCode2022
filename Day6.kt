fun daySix() {
    var position = 0
    val characters = mutableSetOf<Char>()

    File("./src/main/resources/Day6.txt").useLines { lines -> lines.forEach {
        for (char in it) {
            if (characters.size == 4) {
                println("Day 6 - $position")
                break
            } else if (characters.contains(char)) {
                while(characters.indexOf(char) != 0) {
                    characters.remove(characters.first())
                }
            } else if (characters.size < 4) {
                characters.add(char)
                position++
                continue
            }

            characters.remove(characters.first())
            characters.add(char)
            position++
        }
    }}
}

fun daySixP2() {
    var position = 0
    val characters = mutableSetOf<Char>()

    File("./src/main/resources/Day6.txt").useLines { lines -> lines.forEach {
        for (char in it) {
            if (characters.size == 14) {
                println("Day 6 - $position")
                break
            } else if (characters.contains(char)) {
                while(characters.indexOf(char) != 0) {
                    characters.remove(characters.first())
                }
            } else if (characters.size < 14) {
                characters.add(char)
                position++
                continue
            }

            characters.remove(characters.first())
            characters.add(char)
            position++
        }
    }}
}
