

fun main(args: Array<String>) {

    val data = mapOf(
        "users1.csv" to listOf(32, 45, 17, -1, 34),
        "users2.csv" to listOf(19, -1, 67, 22),
        "users3.csv" to listOf(),
        "users4.csv" to listOf(56, 32, 18, 44)
    )


    val flat = data.flatMap { it.value }
    val positiveNums = flat.filterNot {it < 1}
    println(positiveNums)
    val negativeNums = flat.count { e -> e < 0 }
    println("There are $negativeNums negative values")
    val sum = positiveNums.toList().sumBy { it }/positiveNums.size
    println(sum)
    val keyWithNegativeNums = data.filter { it.value.contains(-1) }
    println(keyWithNegativeNums.keys)
    
}


/*
Challenge: Apply Functional Programming for Simple Data Analysis

We decided to gather data on the age of our users.
In this challenge, you'll be presented with this partly faulty data
 of user ages which is based on four input files:
 */

/*
Apply the functions you learned about as well as other functions from Kotlin's
standard library to solve the following data analysis tasks:

1. Find the average age of users (use only valid ages for the calculation!)
2. Extract the names of input files that contain faulty data
3. Count the total number of faulty entries across all input files

Hints: map() and flatMap() are often very useful functions for such tasks
Use IntelliJ's autocompletion to explore which other functions, that were not
presented in the lectures, are available (they could simplify the tasks)
 */