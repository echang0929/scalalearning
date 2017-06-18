package week7

object test {
  val problem = new Pouring(Vector(4,9,13))       //> problem  : week7.Pouring = week7.Pouring@3567135c
//  problem.moves
//  problem.pathSets.take(3).toList
  problem.solutions(6).take(2)                    //> res0: scala.collection.immutable.Stream[week7.test.problem.Path] = Stream(Fi
                                                  //| ll(1) Pour(1,0) Pour(0,2) Pour(1,0) Pour(0,2) Pour(1,0) Fill(1) Pour(1,0)-->
                                                  //|  Vector(4, 6, 8), ?)
}