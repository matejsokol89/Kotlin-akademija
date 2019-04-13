import java.util.*
/*
Create a collection of integers

Use Random to fill the collection with 100 random numbers between 1 and 100.

Go through the collection from start to end and print its elements up to the point where an element is less than or equal to 10
 */
fun main() {

    val amplititudes = IntArray(100) { Random().nextInt(100) }.asList()
    print(amplititudes)
    for (i in amplititudes.indices) {
        if (amplititudes[i]<10){
            println("ovo je :")
            println(amplititudes[i])

        }
    }

}


