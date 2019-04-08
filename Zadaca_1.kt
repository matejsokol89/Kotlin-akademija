package exercises

/*
Implement the member functions of the Robot class. A Robot starts in the (0, 0) cell and can move to the right, to the left, down and up.
Its location is stored as a pair of coordinates (x, y), where (0, 0) is the top-left corner:

(x,y)
(0,0) (1,0)
(0,1) (1,1)
Going right increases x coordinate, going down increases y coordinate, going left and up decreases x and y coordinates accordingly.

Implement goRight(), goLeft(), goUp(), goDown() and getLocation() member functions. getLocation() method should return the coordinates as a string (x, y).
 */
var x = 0
var y =0
class Robot {

    fun goRight(steps: Int) {
        x = +steps
    }

    fun goLeft(steps: Int) {
        x = -steps
        y = -steps
    }

    fun goDown(steps: Int) {
        y = +steps
    }

    fun goUp(steps: Int) {
        x = -steps
        y = -steps
    }

    fun getLocation(): String = ("x is $x y is $y")
}

fun main(args: Array<String>) {
    val robot = Robot()
    println(robot.getLocation())
    robot.goRight(1)
    println(robot.getLocation())
    robot.goDown(2)
    println(robot.getLocation())
    robot.goLeft(1)
    println(robot.getLocation())
}
/* Output:
(0,0)
(1,0)
(1,2)
*/