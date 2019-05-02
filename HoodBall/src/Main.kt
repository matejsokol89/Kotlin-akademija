fun main(args: Array<String>) {
    val sokoolJr = HoodPlayer("Sokool Jr.",29,0,"SG","Shoot za 3 i Dirty Defence",
        3.99)
    val sokoolSr = HoodPlayer("Sokool Sr.",34,23,"PG","All-Around Two-Way Player",
        6.99)
    val homeCoach = HoodCoach("Ludi Bero",67,3.59)

    val homeTeam = HoodTeam("South Side", "Jug 2", listOf(sokoolJr,sokoolSr),homeCoach)

    homeCoach.coach()
//    val people: List<Person> = listOf(hoodPlayer)
    /* todo: homeTeam zadnji korak, daj mu igrace, daj mu coach) */
    val trikika = HoodPlayer("Trikika",38,14,"SG","Scorer i Clutch-er",
        5.99 )
    val bigBaby = HoodPlayer("BigBaby",24,24,"C","Fat-Post-Man",
        4.99 )
    val awayTeam = HoodTeam("North Side", "Jug 2", listOf(trikika,bigBaby),homeCoach)


    sokoolJr.introduction(/* todo: change interface - use 'introduction(HoodGame)' */ )
    println(" ")
    trikika.introduction()

    val aGame = HoodGame(homeTeam, awayTeam)
    aGame.game()

}