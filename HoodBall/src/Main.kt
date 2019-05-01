fun main(args: Array<String>) {
    val hoodPlayer = HoodPlayer("Sokool Jr.",29,0,"SG","Shoot za 3 i Dirty Defence",
        HoodTeam("South Side", "Jug 2") )
    hoodPlayer.introduction()
println(" ")
    val coach = HoodCoach("Ludi Bero",67,HoodTeam("South Side","Jug 2"))
    coach.coach()

    val people: List<Person> = listOf(hoodPlayer)




}