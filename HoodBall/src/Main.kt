
fun main(args: Array<String>) {

//home team and players and coach
    val sokoolJr = HoodPlayer("Sokool Jr.",29,24,"SG","Shoot za 3 i Dirty Defence",
        2.71)
    val sokoolSr = HoodPlayer("Sokool Sr.",34,23,"PG","All-Around Two-Way Player",
        3.70)
    val trikika = HoodPlayer("Trikika",38,14,"SG","Scorer i Clutch-er",
        3.33 )
    val homeCoach = HoodCoach("Ludi Bero",27,2.59)

    val homeTeam = HoodTeam("South Side", "Jug 2", listOf(sokoolJr,sokoolSr,trikika),homeCoach)

//away team and players and coach
    val basta = HoodPlayer("Basta",50,34,"SG","3pt shooter, assist",
        4.95 )
    val ivanGrozni = HoodPlayer("IvanGrozni",45,17,"C","Post and Rebound",
        4.24 )

    val profesorMiss = HoodPlayer("ProfesorMiss",44,27,"PG","Missing everything",
        0.39 )

    val awayTeam = HoodTeam("North Side", "Jug 2", listOf(basta,ivanGrozni,profesorMiss),homeCoach)
    val awayCoach = HoodCoach("Batistuta",17,2.35)

//host
    val host = Host("BigDady", 43,homeTeam.players,homeTeam,awayTeam,homeCoach,awayCoach,awayTeam.players)
    host.introduction()

//
//    sokoolJr.introduction(/* todo: change interface - use 'introduction(HoodGame)' */ )
//    println(" ")
//    trikika.introduction()

    val aGame = HoodGame(homeTeam, awayTeam)
    aGame.game()

}