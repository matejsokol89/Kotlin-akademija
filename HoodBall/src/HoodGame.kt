class HoodGame(private val homeTeam: HoodTeam, private val awayTeam: HoodTeam) {

    var gameScore:HoodScore = HoodScore(0,0,21)

    fun game(){
        var gameOver = false
        var currentTeam:HoodTeam = homeTeam
        while (!gameOver){
            // Throw the ball
            val throwBall:Int=Math.floor( Math.random() * currentTeam.strength).toInt()
            val newPoints = when(throwBall){
                0->pointsMiss
                1->pointsShort
                else->pointsLong
            }
            println(currentTeam.teamName + " je zabio " + newPoints + " poena")
            Thread.sleep(600)

            //increase score
            if(currentTeam == homeTeam){
                gameOver=this.gameScore.increaseHomeScore(newPoints)
            }
            else{
                gameOver= this.gameScore.increaseAwayScore(newPoints)
            }

            if (gameOver){
                Thread.sleep(1000)

                println()
                println("Pobjednik je ekipa ${currentTeam.teamName} sa rezultatom ${gameScore.result()}")
            }

            //swap teams
            if (currentTeam==homeTeam){
                currentTeam=awayTeam
            }
            else{
                currentTeam=homeTeam
            }
        }
        Thread.sleep(1500)

        println()
        println("################### END-GAME ################### ")

    }
}