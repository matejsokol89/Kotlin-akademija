class HoodTeam(
     var teamName : String,
     var hood: String,
     players: List<HoodPlayer>,
     coach: HoodCoach

     ){

    val strength: Double


    init {
        var total:Double = 0.0
        players.forEach{total+=it.playerStrentgh}
        strength = total/players.size * coach.coachStrentgh
        println("ovo je")
        println(strength)


    }
}






