package week4

object exprs {
  def eval(e: Expr): Int = e match {
    case Number(n) => n
    case Sum(e1, e2) => eval(e1) + eval(e2)
  }                                               //> eval: (e: week4.Expr)Int
 	eval(Sum(Number(1), Number(34)))          //> res0: Int = 35

  def show(e: Expr): String = e match {
  	case Number(x) => x.toString
  	case Sum(l, r) => show(l) + " + " + show(r)
  }                                               //> show: (e: week4.Expr)String
  show(Sum(Number(1), Number(44)))                //> res1: String = 1 + 44
  
}