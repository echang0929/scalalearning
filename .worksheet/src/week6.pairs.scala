package week6

object pairs {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(99); 
  def isPrime(n: Int): Boolean = (2 until n) forall (d => n % d != 0);System.out.println("""isPrime: (n: Int)Boolean""");$skip(14); val res$0 = 
  isPrime(43);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(13); 

  val n = 7;System.out.println("""n  : Int = """ + $show(n ));$skip(54); val res$1 = 
  (1 until n) map (i => (1 until i) map (j => (i,j)));System.out.println("""res1: scala.collection.immutable.IndexedSeq[scala.collection.immutable.IndexedSeq[(Int, Int)]] = """ + $show(res$1));$skip(65); 

  val xss = (1 until n) map (i => (1 until i) map (j => (i,j)));System.out.println("""xss  : scala.collection.immutable.IndexedSeq[scala.collection.immutable.IndexedSeq[(Int, Int)]] = """ + $show(xss ));$skip(45); val res$2 = 
  (xss foldRight Seq[(Int,Int)]())( _ ++ _ );System.out.println("""res2: Seq[(Int, Int)] = """ + $show(res$2));$skip(63); val res$3 = 

  (1 until n) map (i => (1 until i) map (j => (i,j))) flatten;System.out.println("""res3: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$3));$skip(59); val res$4 = 

  (1 until n) flatMap (i => (1 until i) map (j => (i,j)));System.out.println("""res4: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$4));$skip(111); val res$5 = 
  
  ((1 until n) map  (i => (1 until i) map (j => (i,j))) flatten) filter (pair => isPrime(pair._1+pair._2));System.out.println("""res5: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$5));$skip(70); val res$6 = 

  for ( i <- 1 until n; j <- 1 until i if isPrime(i+j) ) yield (i,j);System.out.println("""res6: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$6));$skip(85); val res$7 = 
  for {
    i <- 1 until n
    j <- 1 until i
    if isPrime(i + j)
  } yield (i, j);System.out.println("""res7: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$7));$skip(123); 

	 
  def scalarProduct(xs: Vector[Double], ys: Vector[Double]): Double =
  	(for ( (x, y) <- (xs zip ys) ) yield x*y).sum;System.out.println("""scalarProduct: (xs: Vector[Double], ys: Vector[Double])Double""");$skip(46); val res$8 = 
  scalarProduct(Vector(1,2,3), Vector(4,5,6));System.out.println("""res8: Double = """ + $show(res$8))}
}
