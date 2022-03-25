fun main(){
    var fract = Fraction(4,8)
    var fract_other = Fraction(3,5)
    println(fract.reduceFraction())
    println(fract.equals(fract_other))
    println(fract.addition(fract_other))
    println(fract.multiplication((fract_other)))
}

class Fraction(var numerator: Int, var denominator: Int){
    override fun equals(other: Any?): Boolean {
        if (other is Fraction && this.numerator * other.denominator == this.denominator * other.numerator){
            return true
        }
        return false
    }

    fun reduceFraction() {
        val d: Int = gcd(numerator, denominator)
        this.numerator /= d
        denominator /= d
        println("$numerator / $denominator")
    }

    private fun gcd(a: Int, b: Int): Int {
        return if (b == 0) a else gcd(b, a % b)
    }

    fun addition(other: Any?) {
        if (other is Fraction){
            var num = (this.numerator * other.denominator) + (other.numerator * this.denominator)
            var den = this.denominator * other.denominator
            println("$num / $den")
        }
    }

    fun multiplication(other: Any?) {
        if (other is Fraction){
            var num_1 = this.numerator * other.numerator
            var den_1 = this.denominator * other.denominator
            println("$num_1 / $den_1")
        }
    }

}