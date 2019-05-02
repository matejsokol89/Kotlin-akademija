class Host(
    hostName: String,
    age: Int,
    private val hoodTeam: List<HoodPlayer>
    ):Person(hostName,age), Announcer {
    override fun introduction() {

              print("Pozdrav svima ja sam $realName, danas se održava dvoboj između ${hoodTeam[1].realName}" +
                    " evo pravih igrača ${hoodTeam.forEach {it.realName}} ")



    }
}

