open class HoodPlayer(
    hoodName: String,
    age: Int,
    private val jersey: Int,
    private val position:String,
    private val specialAbility: String,// napraviti kao liste
    private val hoodTeamName: HoodTeam


) : Person(hoodName, age), Announcer {
    override fun introduction() {
        val represent = "Pozdrav svima imamo momka od $age godina," +
                " nosi dres sa brojem $jersey i igra na poziciji $position i reperezentira ${hoodTeamName.teamName}," +
                " njegova specijalka je $specialAbility on se zove $realName !!!  "
        print(represent)

    }


}




