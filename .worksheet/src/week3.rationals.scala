package week3

object rationals {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(61); 
  val x = new Rational(1,3);System.out.println("""x  : week3.Rational = """ + $show(x ));$skip(28); 
  val y = new Rational(5,7);System.out.println("""y  : week3.Rational = """ + $show(y ));$skip(28); 
  val z = new Rational(3,2);System.out.println("""z  : week3.Rational = """ + $show(z ));$skip(10); val res$0 = 
  x.numer;System.out.println("""res0: Int = """ + $show(res$0));$skip(10); val res$1 = 
  x.denom;System.out.println("""res1: Int = """ + $show(res$1));$skip(11); val res$2 = 
  
  x + y;System.out.println("""res2: week3.Rational = """ + $show(res$2));$skip(12); val res$3 = 
  x - y - z;System.out.println("""res3: week3.Rational = """ + $show(res$3));$skip(8); val res$4 = 
  y + y;System.out.println("""res4: week3.Rational = """ + $show(res$4));$skip(14); val res$5 = 

	(x + y) * z;System.out.println("""res5: week3.Rational = """ + $show(res$5));$skip(12); val res$6 = 
	  
  x < y;System.out.println("""res6: Boolean = """ + $show(res$6));$skip(10); val res$7 = 
  x max y;System.out.println("""res7: week3.Rational = """ + $show(res$7));$skip(21); val res$8 = 
  
  new Rational(2);System.out.println("""res8: week3.Rational = """ + $show(res$8))}
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
