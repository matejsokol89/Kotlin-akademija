class Host(
    hostName: String,
    age: Int,
    private val homePlayers: List<HoodPlayer>,
    private val homeTeam: HoodTeam,
    private val awayTeam: HoodTeam,
    private val homeCoach: HoodCoach,
    private val awayCoach: HoodCoach,
    private val awayPlayers: List<HoodPlayer>


    ):Person(hostName,age), Announcer {
    override fun introduction() {

              println("Pozdrav svima ja sam $realName Vaš Host za danas. Ljudi čeka nas ludi dvoboj između ${homeTeam.teamName}-a" +
                    " VS ${awayTeam.teamName}-a.")
        println("Sa desne strane je početna trojka ${homeTeam.teamName}-a, a playeri su  ${homePlayers.map { it.realName }.toString().replace("[", "")
            .replace("]", "")} i njihov trener je ${homeCoach.realName} koji vodi ovaj tim već ${homeCoach.age} godina")

        println("A Sa lijeve strane je početna trojka ${awayTeam.teamName}-a, a playeri su  ${awayPlayers.map { it.realName }.toString().replace("[", "")
            .replace("]", "")} i njihov trener je ${awayCoach.realName} koji vodi ovaj tim već ${awayCoach.age} godina")




    }
}

