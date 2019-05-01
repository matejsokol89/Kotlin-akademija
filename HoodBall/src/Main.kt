fun main(args: Array<String>) {
    val homeTeam = HoodTeam("South Side", "Jug 2", 4.0)
    val homePlayer = HoodPlayer("Sokool Jr.",29,0,"SG","Shoot za 3 i Dirty Defence",
        homeTeam )
    val homeCoach = HoodCoach("Ludi Bero",67,homeTeam)
    homeCoach.coach()
//    val people: List<Person> = listOf(hoodPlayer)
    /* todo: homeTeam zadnji korak, daj mu igrace, daj mu coach) */

    val awayTeam = HoodTeam("North Side", "Jug 2", 2.0)
    //val awayPlayer = HoodPlayer("Sokool Sr.",29,0,"SG","Shoot za 3 i Dirty Defence",
    //    homeTeam )

    homePlayer.introduction(/* todo: change interface - use 'introduction(HoodGame)' */ )
    println(" ")

    val aGame = HoodGame(homeTeam, awayTeam)
    aGame.game()

}