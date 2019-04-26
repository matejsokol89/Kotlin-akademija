abstract class Rapper(
    val realName: String,
    val age: Int
) {
    abstract fun getMyName(): String
}



open class BattleMc(
    realName: String,
    age: Int,
    private val stageName: Pair<Int,List<String>>,
    private val rapStyle: Style // HAS-A

) : Rapper(realName, age), SpitRhyme {


    override fun getMyName(): String {
        return "Ja sam Vaš Host $realName za danas, sa lijeve strane imamo: ${stageName.second[0]} vs ${stageName.second[1]}," +
                " sudar stilova jedan je ${rapStyle.style.random()} a drugi je ${rapStyle.style.random()} "
    }


    override fun rhyme() {
        val ryhmeData = mapOf(
            "funny" to listOf("Pucam rime svakoga dana jadna ti majka zavija ti ime kao da je cajka"),
            "flow" to listOf("Otkinem ti glavu jer imam rime udarne, pa ti vuglu ko klugu kasnije koristim za kuglanje"),
            "flow" to listOf("Peglam te ko peglu za peglanje,ko peglica si ispeglan loše ti je repanje")

            )


        println("${stageName.second[0]}:${ryhmeData.values.random()}")
        println("VS")
        println("${stageName.second[1]}:${ryhmeData.values.random()}")


    }

}


class Style(val style: List<String>)

interface SpitRhyme {

    fun rhyme()
}





fun main(args: Array<String>) {

    val sokool = BattleMc("Matej Sokol",29,1 to listOf("Sokool","Ladidadi"),Style(listOf("Flow","Punch",
        "Funny", "Overall", "Delivery", "Agressive", "Wordplay")))

    sokool.rhyme()


    val people: List<Rapper> = listOf(sokool)

    for (person in people) {
        println(person.getMyName())
    }
}