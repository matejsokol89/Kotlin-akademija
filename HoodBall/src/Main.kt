fun main(args: Array<String>) {
    val homePlayer = HoodPlayer("Sokool Jr.",29,0,"SG","Shoot za 3 i Dirty Defence",
        9.99)
    val homeTeam = HoodTeam("South Side", "Jug 2", listOf(homePlayer))

    val homeCoach = HoodCoach("Ludi Bero",67,homeTeam)
    homeCoach.coach()
//    val people: List<Person> = listOf(hoodPlayer)
    /* todo: homeTeam zadnji korak, daj mu igrace, daj mu coach) */
    val awayPlayer = HoodPlayer("Sokool Sr.",29,0,"SG","Shoot za 3 i Dirty Defence",
        2.99 )
    val awayTeam = HoodTeam("North Side", "Jug 2", listOf(awayPlayer))


    homePlayer.introduction(/* todo: change interface - use 'introduction(HoodGame)' */ )
    println(" ")
    awayPlayer.introduction()

    val aGame = HoodGame(homeTeam, awayTeam)
    aGame.game()

}