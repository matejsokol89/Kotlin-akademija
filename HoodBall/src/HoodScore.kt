
class HoodScore(private var homeScore:Int, private var awayScore:Int, private val winningScore:Int){
     fun increaseAwayScore(points:Int):Boolean{
        this.awayScore += points
         return this.awayScore >= winningScore && this.awayScore > this.homeScore+1


    }
    fun increaseHomeScore(points:Int):Boolean{
        this.homeScore += points
        return this.homeScore >= winningScore && this.homeScore > this.awayScore+1


    }
    fun result(): String {
        return "$homeScore : $awayScore"
    }

}
const val pointsMiss:Int=0
const val pointsShort:Int=2
const val pointsLong:Int=3



