var heroName: String = ""

fun main() {
    narrate("A hero enters the town of Kronstadt. What is their name?")
    heroName = promptHeroName()
    narrate("$heroName, ${createTitle(heroName)}, heads to the town square")
    visitTavern()
}

private fun promptHeroName(): String {
    println("Madrigal")
    return "Madrigal"
}

private fun createTitle(name: String): String {
    return when {

        name.all { it.isDigit() } -> "TheIdentifiable"
        name.none { it.isLetter() } -> "The WitnessProtection Member"
        name.count { it.lowercase() in "aeiou" } > 4 -> "The Master of Vowels"

        else -> "The Renowned Hero"
    }
}

//fun main() {
//
//    narrate("A hero enters the town of Kronstadt. What is their name?")
//    val heroName = readLine() ?: ""
//    require(heroName.isNotEmpty()) {
//        "the hero must have a name"
//    }
//    changeNarratorMood()
//    narrate("$heroName heads to the town square")
//    narrate("$heroName, ${createTitle(heroName)}, heads to the town square")
//}
//
//private fun createTitle(name: String): String {
//    return when {
//
//        name.all { it.isDigit() } -> "TheIdentifiable"
//        name.none { it.isLetter() } -> "The WitnessProtection Member"
//        name.count { it.lowercase() in "aeiou" } > 4 -> "The Master of Vowels"
//
//        else -> "The Renowned Hero"
//    }
//}