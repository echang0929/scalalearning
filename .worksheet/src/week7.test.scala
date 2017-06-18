package week7

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(72); 
  val problem = new Pouring(Vector(4,9,13));System.out.println("""problem  : week7.Pouring = """ + $show(problem ));$skip(85); val res$0 = 
//  problem.moves
//  problem.pathSets.take(3).toList
  problem.solutions(6).take(2);System.out.println("""res0: scala.collection.immutable.Stream[week7.test.problem.Path] = """ + $show(res$0))}
}
