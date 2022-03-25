fun main() {
    var firstPoint = Point(1, 4)
    var secondPoint = Point(3,-6)
    println(firstPoint.symmetry())
    println(secondPoint.symmetry())
    println(firstPoint.equals(secondPoint))
}

class Point(var x: Int, var y: Int){
    override fun toString(): String {
        return "${this.x}, ${this.y}"
    }

    override fun equals(other: Any?): Boolean {
        if (other is Point && other.x == this.x && other.y == this.y){
            return true
        }
        return false
    }
    fun symmetry(): Pair<Int, Int> {
        this.x = - x
        this.y = - y
        return Pair(x, y)
    }
}