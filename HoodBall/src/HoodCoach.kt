class HoodCoach(
    coachName: String,
    age: Int,
//    private val hoodTeamName: HoodTeam,
    val coachStrentgh:Double
    ):Person(coachName,age) {
    fun coach(){
        print("Trener ekipe trenira ekipu već $age godina, dolazi nam sa , njegovo ime je $realName !!!")
    }

}

