package week3

object rationals1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(62); 
  val x = new Rational(1,3);System.out.println("""x  : week3.Rational = """ + $show(x ));$skip(28); 
  val y = new Rational(5,7);System.out.println("""y  : week3.Rational = """ + $show(y ));$skip(28); 
  val z = new Rational(3,2);System.out.println("""z  : week3.Rational = """ + $show(z ));$skip(10); val res$0 = 
  x.numer;System.out.println("""res0: Int = """ + $show(res$0));$skip(10); val res$1 = 
  x.denom;System.out.println("""res1: Int = """ + $show(res$1));$skip(14); val res$2 = 
  
  x.add(y);System.out.println("""res2: week3.Rational = """ + $show(res$2));$skip(18); val res$3 = 
  x.sub(y).sub(z);System.out.println("""res3: week3.Rational = """ + $show(res$3));$skip(11); val res$4 = 
  y.add(y);System.out.println("""res4: week3.Rational = """ + $show(res$4));$skip(18); val res$5 = 

	x.add(y).mul(z);System.out.println("""res5: week3.Rational = """ + $show(res$5))}
}

class Rational(x: Int, y: Int){
	def numer = x
	def denom = y
	
	def add(r: Rational) =
		new Rational(numer * r.denom + r.numer * denom,
									denom * r.denom)
	def neg: Rational = new Rational(-numer, denom)
	def sub(r: Rational) = add(r.neg)
  
  def mul(r: Rational) =
  	new Rational(numer * r.numer, denom * r.denom)

	override def toString = numer + "/" + denom
}
