package week3

object rationals {
  val x = new Rational(1,3)                       //> x  : week3.Rational = 1/3
  val y = new Rational(5,7)                       //> y  : week3.Rational = 5/7
  val z = new Rational(3,2)                       //> z  : week3.Rational = 3/2
  x.numer                                         //> res0: Int = 1
  x.denom                                         //> res1: Int = 3
  
  x + y                                           //> res2: week3.Rational = 22/21
  x - y - z                                       //> res3: week3.Rational = -79/42
  y + y                                           //> res4: week3.Rational = 10/7

	(x + y) * z                               //> res5: week3.Rational = 11/7
	  
  x < y                                           //> res6: Boolean = true
  x max y                                         //> res7: week3.Rational = 5/7
  
  new Rational(2)                                 //> res8: week3.Rational = 2/1
}

class Rational(x: Int, y: Int){
	require(y != 0, "denominator must be nonzero")
	
	def this(x: Int) = this(x,1)
	
	private def gcd(a: Int, b: Int): Int =
		if (b==0) a
		else gcd(b, a%b)
	private val g = gcd(x, y)
	val numer = x / g
	val denom = y / g
	
	def + (r: Rational) =
		new Rational(numer * r.denom + r.numer * denom,
									denom * r.denom)
	def unary_- : Rational = new Rational(-numer, denom)
	def - (r: Rational) = this + -r
  
  def * (r: Rational) =
  	new Rational(numer * r.numer, denom * r.denom)

	def < (that: Rational) = numer*that.denom < that.numer*denom
	def max(that: Rational) = if (this < that) that else this
	
	override def toString = numer + "/" + denom
}