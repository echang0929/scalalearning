package week7

object streams {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(101); 
  def isPrime(n: Int): Boolean = (2 until n) forall (d => n % d != 0);System.out.println("""isPrime: (n: Int)Boolean""");$skip(50); val res$0 = 
  
  ((1000 to 10000).toStream filter isPrime)(0);System.out.println("""res0: Int = """ + $show(res$0));$skip(151); 

  def streamRange(lo: Int, hi: Int): Stream[Int] = {
//    print(lo + " ")
    if (lo >= hi) Stream.empty
    else lo #:: streamRange(lo + 1, hi)
  };System.out.println("""streamRange: (lo: Int, hi: Int)Stream[Int]""");$skip(19); val res$1 = 
  streamRange(1,5);System.out.println("""res1: Stream[Int] = """ + $show(res$1));$skip(36); val res$2 = 
  streamRange(1, 10).take(4).toList;System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(48); val res$3 = 

  (streamRange(1000, 10000) filter isPrime)(0);System.out.println("""res3: Int = """ + $show(res$3));$skip(109); 
  
  def listRange(lo: Int, hi: Int): List[Int] =
    if (lo >= hi) Nil
    else lo :: listRange(lo + 1, hi);System.out.println("""listRange: (lo: Int, hi: Int)List[Int]""");$skip(17); val res$4 = 
  listRange(1,5);System.out.println("""res4: List[Int] = """ + $show(res$4));$skip(186); 

//  (listRange(1000, 10000) filter isPrime)(0)

  def expr = {
    val x = {print("x "); 1}
    lazy val y = {print("y "); 2}
    def z = {print("z "); 3}
    z + y + x + z + y + x
  };System.out.println("""expr: => Int""");$skip(7); val res$5 = 
  expr;System.out.println("""res5: Int = """ + $show(res$5));$skip(53); val res$6 = 

  (streamRange(1000, 10000) filter isPrime) apply 1;System.out.println("""res6: Int = """ + $show(res$6))}
}
