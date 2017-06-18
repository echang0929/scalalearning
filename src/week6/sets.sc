package week6

object sets {
  def mapFun[T,U](xs: List[T], f: T => U): List[U] =
    for (x <- xs) yield f(x)                      //> mapFun: [T, U](xs: List[T], f: T => U)List[U]
    
  def flatMap[T,U](xs: List[T], f: T => Iterable[U]): List[U] =
    for (x <- xs; y <- f(x)) yield y              //> flatMap: [T, U](xs: List[T], f: T => Iterable[U])List[U]

  def filter[T](xs: List[T], p: T => Boolean): List[T] =
    for (x <- xs if p(x)) yield x                 //> filter: [T](xs: List[T], p: T => Boolean)List[T]


  def isPrime(n: Int): Boolean = (2 until n) forall (d => n % d != 0)
                                                  //> isPrime: (n: Int)Boolean
  val n = 7                                       //> n  : Int = 7
  
  for {
    i <- 1 until n
    j <- 1 until i
    if isPrime(i + j)
  } yield (i, j)                                  //> res0: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((2,1), (3,2
                                                  //| ), (4,1), (4,3), (5,2), (6,1), (6,5))

  (1 until n) flatMap (i =>
    for (j <- 1 until i; if isPrime(i + j))
    yield (i, j) )                                //> res1: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((2,1), (3,2
                                                  //| ), (4,1), (4,3), (5,2), (6,1), (6,5))
  
  (1 until n) flatMap (i =>
    for (j <- (1 until i).withFilter(j => isPrime(i + j) ))
    yield (i, j))                                 //> res2: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((2,1), (3,2
                                                  //| ), (4,1), (4,3), (5,2), (6,1), (6,5))
  (1 until n) flatMap (i =>
    (1 until i).withFilter(j => isPrime(i + j) ).map(j =>
      (i, j) ))                                   //> res3: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((2,1), (3,2
                                                  //| ), (4,1), (4,3), (5,2), (6,1), (6,5))


}