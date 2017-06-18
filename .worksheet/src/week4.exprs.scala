package week4

object exprs {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(138); 
  def eval(e: Expr): Int = e match {
    case Number(n) => n
    case Sum(e1, e2) => eval(e1) + eval(e2)
  };System.out.println("""eval: (e: week4.Expr)Int""");$skip(35); val res$0 = 
 	eval(Sum(Number(1), Number(34)));System.out.println("""res0: Int = """ + $show(res$0));$skip(124); 

  def show(e: Expr): String = e match {
  	case Number(x) => x.toString
  	case Sum(l, r) => show(l) + " + " + show(r)
  };System.out.println("""show: (e: week4.Expr)String""");$skip(35); val res$1 = 
  show(Sum(Number(1), Number(44)));System.out.println("""res1: String = """ + $show(res$1))}
  
}
