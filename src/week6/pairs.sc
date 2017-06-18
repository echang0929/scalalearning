package week6

object pairs {
  def isPrime(n: Int): Boolean = (2 until n) forall (d => n % d != 0)
                                                  //> isPrime: (n: Int)Boolean
  isPrime(43)                                     //> res0: Boolean = true

  val n = 7                                       //> n  : Int = 7
  (1 until n) map (i => (1 until i) map (j => (i,j)))
                                                  //> res1: scala.collection.immutable.IndexedSeq[scala.collection.immutable.Index
                                                  //| edSeq[(Int, Int)]] = Vector(Vector(), Vector((2,1)), Vector((3,1), (3,2)), V
                                                  //| ector((4,1), (4,2), (4,3)), Vector((5,1), (5,2), (5,3), (5,4)), Vector((6,1)
                                                  //| , (6,2), (6,3), (6,4), (6,5)))

  val xss = (1 until n) map (i => (1 until i) map (j => (i,j)))
                                                  //> xss  : scala.collection.immutable.IndexedSeq[scala.collection.immutable.Inde
                                                  //| xedSeq[(Int, Int)]] = Vector(Vector(), Vector((2,1)), Vector((3,1), (3,2)), 
                                                  //| Vector((4,1), (4,2), (4,3)), Vector((5,1), (5,2), (5,3), (5,4)), Vector((6,1
                                                  //| ), (6,2), (6,3), (6,4), (6,5)))
  (xss foldRight Seq[(Int,Int)]())( _ ++ _ )      //> res2: Seq[(Int, Int)] = Vector((2,1), (3,1), (3,2), (4,1), (4,2), (4,3), (5,
                                                  //| 1), (5,2), (5,3), (5,4), (6,1), (6,2), (6,3), (6,4), (6,5))

  (1 until n) map (i => (1 until i) map (j => (i,j))) flatten
                                                  //> res3: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((2,1), (3,1
                                                  //| ), (3,2), (4,1), (4,2), (4,3), (5,1), (5,2), (5,3), (5,4), (6,1), (6,2), (6,
                                                  //| 3), (6,4), (6,5))

  (1 until n) flatMap (i => (1 until i) map (j => (i,j)))
                                                  //> res4: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((2,1), (3,1
                                                  //| ), (3,2), (4,1), (4,2), (4,3), (5,1), (5,2), (5,3), (5,4), (6,1), (6,2), (6,
                                                  //| 3), (6,4), (6,5))
  
  ((1 until n) map  (i => (1 until i) map (j => (i,j))) flatten) filter (pair => isPrime(pair._1+pair._2))
                                                  //> res5: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((2,1), (3,2
                                                  //| ), (4,1), (4,3), (5,2), (6,1), (6,5))

  for ( i <- 1 until n; j <- 1 until i if isPrime(i+j) ) yield (i,j)
                                                  //> res6: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((2,1), (3,2
                                                  //| ), (4,1), (4,3), (5,2), (6,1), (6,5))
  for {
    i <- 1 until n
    j <- 1 until i
    if isPrime(i + j)
  } yield (i, j)                                  //> res7: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((2,1), (3,2
                                                  //| ), (4,1), (4,3), (5,2), (6,1), (6,5))

	 
  def scalarProduct(xs: Vector[Double], ys: Vector[Double]): Double =
  	(for ( (x, y) <- (xs zip ys) ) yield x*y).sum
                                                  //> scalarProduct: (xs: Vector[Double], ys: Vector[Double])Double
  scalarProduct(Vector(1,2,3), Vector(4,5,6))     //> res8: Double = 32.0
}