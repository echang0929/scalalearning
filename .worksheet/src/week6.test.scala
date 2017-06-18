package week6

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(55); 
  val xs = Array(1,2,3,44);System.out.println("""xs  : Array[Int] = """ + $show(xs ));$skip(15); val res$0 = 
  xs map (_*2);System.out.println("""res0: Array[Int] = """ + $show(res$0));$skip(27); 
  
  val s = "Hello World";System.out.println("""s  : String = """ + $show(s ));$skip(23); val res$1 = 
  s filter (_.isUpper);System.out.println("""res1: String = """ + $show(res$1));$skip(23); val res$2 = 
  s exists (_.isUpper);System.out.println("""res2: Boolean = """ + $show(res$2));$skip(23); val res$3 = 
  s forall (_.isUpper);System.out.println("""res3: Boolean = """ + $show(res$3));$skip(35); 
  
  val pairs = List(1,2,3) zip s;System.out.println("""pairs  : List[(Int, Char)] = """ + $show(pairs ));$skip(14); val res$4 = 
  pairs.unzip;System.out.println("""res4: (List[Int], List[Char]) = """ + $show(res$4));$skip(35); val res$5 = 
  
  s flatMap (c => List('.', c));System.out.println("""res5: String = """ + $show(res$5));$skip(12); val res$6 = 
  
  xs.max;System.out.println("""res6: Int = """ + $show(res$6));$skip(9); val res$7 = 
  xs.sum;System.out.println("""res7: Int = """ + $show(res$7));$skip(15); 
  
  val M = 6;System.out.println("""M  : Int = """ + $show(M ));$skip(12); 
  val N = 3;System.out.println("""N  : Int = """ + $show(N ));$skip(52); val res$8 = 
  (1 to M) flatMap (x => (1 to N) map (y => (x,y)));System.out.println("""res8: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$8));$skip(280); 
                                                  
//  def scalarProduct(xs: Vector[Double], ys: Vector[Double]): Double =
//  	(xs zip ys).map(xy => xy._1*xy._2).sum

  def scalarProduct(xs: Vector[Double], ys: Vector[Double]): Double =
  	(xs zip ys).map{case (x,y) => x*y}.sum;System.out.println("""scalarProduct: (xs: Vector[Double], ys: Vector[Double])Double""");$skip(49); val res$9 = 
  
  scalarProduct(Vector(1,2,3), Vector(4,5,6));System.out.println("""res9: Double = """ + $show(res$9));$skip(73); 
  
  def isPrime(n: Int): Boolean = (2 until n) forall (d => n % d != 0);System.out.println("""isPrime: (n: Int)Boolean""");$skip(13); val res$10 = 
  isPrime(2);System.out.println("""res10: Boolean = """ + $show(res$10));$skip(14); val res$11 = 
	isPrime(100);System.out.println("""res11: Boolean = """ + $show(res$11));$skip(13); val res$12 = 
	isPrime(31);System.out.println("""res12: Boolean = """ + $show(res$12))}
}
