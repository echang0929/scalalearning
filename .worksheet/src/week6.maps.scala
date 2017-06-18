package week6

object maps {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(85); 
  val romanNumerals = Map('I' -> 1, 'V' -> 5, 'X' -> 10);System.out.println("""romanNumerals  : scala.collection.immutable.Map[Char,Int] = """ + $show(romanNumerals ));$skip(76); 
  val capitalOfCountry = Map("US" -> "Washington", "Switzerland" -> "Bern");System.out.println("""capitalOfCountry  : scala.collection.immutable.Map[String,String] = """ + $show(capitalOfCountry ));$skip(79); 
  
  val countryOfCaptial = capitalOfCountry map {
    case (x,y) => (y,x)
  };System.out.println("""countryOfCaptial  : scala.collection.immutable.Map[String,String] = """ + $show(countryOfCaptial ));$skip(25); val res$0 = 
  capitalOfCountry("US");System.out.println("""res0: String = """ + $show(res$0));$skip(146); 

  def showCapital(country: String) = capitalOfCountry.get(country) match {
    case Some(capital) => capital
    case None => "missing data"
  };System.out.println("""showCapital: (country: String)String""");$skip(20); val res$1 = 
  showCapital("US");System.out.println("""res1: String = """ + $show(res$1));$skip(25); val res$2 = 
  showCapital("Andorra");System.out.println("""res2: String = """ + $show(res$2));$skip(60); 

  val fruit = List("apple", "pear", "orange", "pineapple");System.out.println("""fruit  : List[String] = """ + $show(fruit ));$skip(39); val res$3 = 
  fruit sortWith (_.length < _.length);System.out.println("""res3: List[String] = """ + $show(res$3));$skip(15); val res$4 = 
  fruit.sorted;System.out.println("""res4: List[String] = """ + $show(res$4));$skip(26); val res$5 = 

  fruit groupBy (_.head);System.out.println("""res5: scala.collection.immutable.Map[Char,List[String]] = """ + $show(res$5))}
}
