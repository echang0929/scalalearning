object week5 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(63); 
  val fruit = List("apples", "oranges", "pears");System.out.println("""fruit  : List[String] = """ + $show(fruit ));$skip(25); 
  val nums = List(1,2,3);System.out.println("""nums  : List[Int] = """ + $show(nums ));$skip(60); 
  val diag3 = List(List(1, 0, 0), List(0,1,0), List(0,0,1));System.out.println("""diag3  : List[List[Int]] = """ + $show(diag3 ));$skip(21); 
  val empty = List();System.out.println("""empty  : List[Nothing] = """ + $show(empty ));$skip(76); 
  
  def removeAt[T](n: Int, xs: List[T]) = (xs take n) ::: (xs drop n + 1);System.out.println("""removeAt: [T](n: Int, xs: List[T])List[T]""");$skip(21); val res$0 = 
  removeAt(1, fruit);System.out.println("""res0: List[String] = """ + $show(res$0))}
}
