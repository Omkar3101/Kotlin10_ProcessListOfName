import java.util.*

//Project 10 : Process a List of Name

/*
Write a Kotlin program that takes a list of names and performs the following operations:
Filter: Remove names that are shorter than 4 characters.
Map: Convert the remaining names to uppercase.
Group: Orgranize the names by their first letter.
 */

fun processName(names: List<String>): Map<Char, List<String>> {
    //Step 1 : Filter names with at least 4 characters
    val filteredNames = names.filter {it.length >= 4}

    //Step 2 : Convert each name to uppercase
    val upperCaseNames = filteredNames.map { it.uppercase(Locale.getDefault()) }

    //Step 3 : Group names by their first letter
    val groupedNames = upperCaseNames.groupBy{it.first()}

    return groupedNames
}

fun main() {
    val names = listOf("Amy","Jo","Meg","Emma","Frank","Ryuu")
    val result = processName(names)
    println(result)
}