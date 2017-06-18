package week6

object test {
  val xs = Array(1,2,3,44)                        //> xs  : Array[Int] = Array(1, 2, 3, 44)
  xs map (_*2)                                    //> res0: Array[Int] = Array(2, 4, 6, 88)
  
  val s = "Hello World"                           //> s  : String = Hello World
  s filter (_.isUpper)                            //> res1: String = HW
  s exists (_.isUpper)                            //> res2: Boolean = true
  s forall (_.isUpper)                            //> res3: Boolean = false
  
  val pairs = List(1,2,3) zip s                   //> pairs  : List[(Int, Char)] = List((1,H), (2,e), (3,l))
  pairs.unzip                                     //> res4: (List[Int], List[Char]) = (List(1, 2, 3),List(H, e, l))
  
  s flatMap (c => List('.', c))                   //> res5: String = .H.e.l.l.o. .W.o.r.l.d
  
  xs.max                                          //> res6: Int = 44
  xs.sum                                          //> res7: Int = 50
  
  val M = 6                                       //> M  : Int = 6
  val N = 3                                       //> N  : Int = 3
  (1 to M) flatMap (x => (1 to N) map (y => (x,y)))
                                                  //> res8: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((1,1), (1,2
                                                  //| ), (1,3), (2,1), (2,2), (2,3), (3,1), (3,2), (3,3), (4,1), (4,2), (4,3), (5,
                                                  //| 1), (5,2), (5,3), (6,1), (6,2), (6,3))
                                                  
//  def scalarProduct(xs: Vector[Double], ys: Vector[Double]): Double =
//  	(xs zip ys).map(xy => xy._1*xy._2).sum

  def scalarProduct(xs: Vector[Double], ys: Vector[Double]): Double =
  	(xs zip ys).map{case (x,y) => x*y}.sum    //> scalarProduct: (xs: Vector[Double], ys: Vector[Double])Double
  
  scalarProduct(Vector(1,2,3), Vector(4,5,6))     //> res9: Double = 32.0
  
  def isPrime(n: Int): Boolean = (2 until n) forall (d => n % d != 0)
                                                  //> isPrime: (n: Int)Boolean
  isPrime(2)                                      //> res10: Boolean = true
	isPrime(100)                              //> res11: Boolean = false
	isPrime(31)                               //> res12: Boolean = true
}