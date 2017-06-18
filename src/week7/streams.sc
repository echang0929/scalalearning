package week7

object streams {
  def isPrime(n: Int): Boolean = (2 until n) forall (d => n % d != 0)
                                                  //> isPrime: (n: Int)Boolean
  
  ((1000 to 10000).toStream filter isPrime)(0)    //> res0: Int = 1009

  def streamRange(lo: Int, hi: Int): Stream[Int] = {
//    print(lo + " ")
    if (lo >= hi) Stream.empty
    else lo #:: streamRange(lo + 1, hi)
  }                                               //> streamRange: (lo: Int, hi: Int)Stream[Int]
  streamRange(1,5)                                //> res1: Stream[Int] = Stream(1, ?)
  streamRange(1, 10).take(4).toList               //> res2: List[Int] = List(1, 2, 3, 4)

  (streamRange(1000, 10000) filter isPrime)(0)    //> res3: Int = 1009
  
  def listRange(lo: Int, hi: Int): List[Int] =
    if (lo >= hi) Nil
    else lo :: listRange(lo + 1, hi)              //> listRange: (lo: Int, hi: Int)List[Int]
  listRange(1,5)                                  //> res4: List[Int] = List(1, 2, 3, 4)

//  (listRange(1000, 10000) filter isPrime)(0)

  def expr = {
    val x = {print("x "); 1}
    lazy val y = {print("y "); 2}
    def z = {print("z "); 3}
    z + y + x + z + y + x
  }                                               //> expr: => Int
  expr                                            //> x z y z res5: Int = 12

  (streamRange(1000, 10000) filter isPrime) apply 1
                                                  //> res6: Int = 1013
}