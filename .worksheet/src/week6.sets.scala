package week6

object sets {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(110); 
  def mapFun[T,U](xs: List[T], f: T => U): List[U] =
    for (x <- xs) yield f(x);System.out.println("""mapFun: [T, U](xs: List[T], f: T => U)List[U]""");$skip(106); 
    
  def flatMap[T,U](xs: List[T], f: T => Iterable[U]): List[U] =
    for (x <- xs; y <- f(x)) yield y;System.out.println("""flatMap: [T, U](xs: List[T], f: T => Iterable[U])List[U]""");$skip(92); 

  def filter[T](xs: List[T], p: T => Boolean): List[T] =
    for (x <- xs if p(x)) yield x;System.out.println("""filter: [T](xs: List[T], p: T => Boolean)List[T]""");$skip(72); 


  def isPrime(n: Int): Boolean = (2 until n) forall (d => n % d != 0);System.out.println("""isPrime: (n: Int)Boolean""");$skip(12); 
  val n = 7;System.out.println("""n  : Int = """ + $show(n ));$skip(88); val res$0 = 
  
  for {
    i <- 1 until n
    j <- 1 until i
    if isPrime(i + j)
  } yield (i, j);System.out.println("""res0: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$0));$skip(92); val res$1 = 

  (1 until n) flatMap (i =>
    for (j <- 1 until i; if isPrime(i + j))
    yield (i, j) );System.out.println("""res1: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$1));$skip(109); val res$2 = 
  
  (1 until n) flatMap (i =>
    for (j <- (1 until i).withFilter(j => isPrime(i + j) ))
    yield (i, j));System.out.println("""res2: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$2));$skip(102); val res$3 = 
  (1 until n) flatMap (i =>
    (1 until i).withFilter(j => isPrime(i + j) ).map(j =>
      (i, j) ));System.out.println("""res3: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$3))}


}
