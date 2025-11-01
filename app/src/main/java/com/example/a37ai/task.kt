fun main(){
    val meaning = mapOf(
        "football" to "round object.",
        "apple" to " A read colour fruit.",
        "vacation" to "a long off day from daily daily life ofter for refreshment.",
        "Student" to "An individual who goes to and instudtion for studying."

    )

    print("Enter the word to find its meaning: ")
    val input: String = readln().lowercase()
    println(meaning[input])
}