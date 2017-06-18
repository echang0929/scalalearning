package week6

import java.lang.String

object books {
  case class Book(title: String, authors: List[String])
  
  val books = Set(
  	Book(
  		title = "Structure and Interpretation of Computer Programs",
  		authors = List("Abelson, Harald", "Sussman, Gerald J.")),
  	Book(
  		title = "Introduction to Functional Programming",
  		authors = List("Bird, Richard", "Wadler, Phil")),
  	Book(
  		title = "Effective Java",
  		authors = List("Bloch, Joshua")),
  	Book(
  		title = "Effective Java 2",
  		authors = List("Bloch, Joshua")),
  	Book(
  		title = "Java Puzzlers",
  		authors = List("Bloch, Joshua", "Gafter, Neal")),
  	Book(
  		title = "Programming in Scala",
  		authors = List("Odersky, Martin", "Spoon, Lex", "Venners, Bill")))
                                                  //> books  : scala.collection.immutable.Set[week6.books.Book] = Set(Book(Effecti
                                                  //| ve Java 2,List(Bloch, Joshua)), Book(Programming in Scala,List(Odersky, Mart
                                                  //| in, Spoon, Lex, Venners, Bill)), Book(Structure and Interpretation of Comput
                                                  //| er Programs,List(Abelson, Harald, Sussman, Gerald J.)), Book(Effective Java,
                                                  //| List(Bloch, Joshua)), Book(Introduction to Functional Programming,List(Bird,
                                                  //|  Richard, Wadler, Phil)), Book(Java Puzzlers,List(Bloch, Joshua, Gafter, Nea
                                                  //| l)))
	for (b <- books; a <- b.authors if a startsWith "Bloch,")
	yield b.title                             //> res0: scala.collection.immutable.Set[String] = Set(Effective Java 2, Effecti
                                                  //| ve Java, Java Puzzlers)
  books flatMap (b =>
    for (a <- b.authors if a startsWith "Bloch,")
    yield b.title)                                //> res1: scala.collection.immutable.Set[String] = Set(Effective Java 2, Effecti
                                                  //| ve Java, Java Puzzlers)

  books flatMap (b =>
    for (a <- (b.authors).withFilter(a => a startsWith "Bloch,") )
    yield b.title )                               //> res2: scala.collection.immutable.Set[String] = Set(Effective Java 2, Effect
                                                  //| ive Java, Java Puzzlers)
 
   books flatMap (b =>
    (b.authors).withFilter(a => a startsWith "Bloch,").map(a =>
      b.title ) )                                 //> res3: scala.collection.immutable.Set[String] = Set(Effective Java 2, Effect
                                                  //| ive Java, Java Puzzlers)
  

	for (b <- books if ( (b.title).indexOf("Program") >= 0) )
	yield b.title                             //> res4: scala.collection.immutable.Set[String] = Set(Programming in Scala, St
                                                  //| ructure and Interpretation of Computer Programs, Introduction to Functional
                                                  //|  Programming)

  for {
	b1 <- books
	b2 <- books
	if b1.title < b2.title
	a1 <- b1.authors
	a2 <- b2.authors
	if a1 == a2
  } yield a1                                      //> res5: scala.collection.immutable.Set[String] = Set(Bloch, Joshua)
}