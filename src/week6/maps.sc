package week6

object maps {
  val romanNumerals = Map('I' -> 1, 'V' -> 5, 'X' -> 10)
                                                  //> romanNumerals  : scala.collection.immutable.Map[Char,Int] = Map(I -> 1, V -> 
                                                  //| 5, X -> 10)
  val capitalOfCountry = Map("US" -> "Washington", "Switzerland" -> "Bern")
                                                  //> capitalOfCountry  : scala.collection.immutable.Map[String,String] = Map(US -
                                                  //| > Washington, Switzerland -> Bern)
  
  val countryOfCaptial = capitalOfCountry map {
    case (x,y) => (y,x)
  }                                               //> countryOfCaptial  : scala.collection.immutable.Map[String,String] = Map(Wash
                                                  //| ington -> US, Bern -> Switzerland)
  capitalOfCountry("US")                          //> res0: String = Washington

  def showCapital(country: String) = capitalOfCountry.get(country) match {
    case Some(capital) => capital
    case None => "missing data"
  }                                               //> showCapital: (country: String)String
  showCapital("US")                               //> res1: String = Washington
  showCapital("Andorra")                          //> res2: String = missing data

  val fruit = List("apple", "pear", "orange", "pineapple")
                                                  //> fruit  : List[String] = List(apple, pear, orange, pineapple)
  fruit sortWith (_.length < _.length)            //> res3: List[String] = List(pear, apple, orange, pineapple)
  fruit.sorted                                    //> res4: List[String] = List(apple, orange, pear, pineapple)

  fruit groupBy (_.head)                          //> res5: scala.collection.immutable.Map[Char,List[String]] = Map(p -> List(pear
                                                  //| , pineapple), a -> List(apple), o -> List(orange))
}