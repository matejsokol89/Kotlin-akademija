class HoodCoach(
    coachName: String,
    age: Int,
    private val hoodTeamName: HoodTeam
    ):Person(coachName,age) {
    fun coach(){
        print("Trener ekipe ${hoodTeamName.teamName} trenirak ekipu već $age godina, dolazi nam sa ${hoodTeamName.hood}, njegovo ime je $realName !!!")
    }

}

