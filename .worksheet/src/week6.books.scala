package week6

import java.lang.String

object books {
  case class Book(title: String, authors: List[String]);import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(749); 
  
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
  		authors = List("Odersky, Martin", "Spoon, Lex", "Venners, Bill")));System.out.println("""books  : scala.collection.immutable.Set[week6.books.Book] = """ + $show(books ));$skip(74); val res$0 = 
	for (b <- books; a <- b.authors if a startsWith "Bloch,")
	yield b.title;System.out.println("""res0: scala.collection.immutable.Set[String] = """ + $show(res$0));$skip(91); val res$1 = 
  books flatMap (b =>
    for (a <- b.authors if a startsWith "Bloch,")
    yield b.title);System.out.println("""res1: scala.collection.immutable.Set[String] = """ + $show(res$1));$skip(110); val res$2 = 

  books flatMap (b =>
    for (a <- (b.authors).withFilter(a => a startsWith "Bloch,") )
    yield b.title );System.out.println("""res2: scala.collection.immutable.Set[String] = """ + $show(res$2));$skip(107); val res$3 = 
 
   books flatMap (b =>
    (b.authors).withFilter(a => a startsWith "Bloch,").map(a =>
      b.title ) );System.out.println("""res3: scala.collection.immutable.Set[String] = """ + $show(res$3));$skip(78); val res$4 = 
  

	for (b <- books if ( (b.title).indexOf("Program") >= 0) )
	yield b.title;System.out.println("""res4: scala.collection.immutable.Set[String] = """ + $show(res$4));$skip(121); val res$5 = 

  for {
	b1 <- books
	b2 <- books
	if b1.title < b2.title
	a1 <- b1.authors
	a2 <- b2.authors
	if a1 == a2
  } yield a1;System.out.println("""res5: scala.collection.immutable.Set[String] = """ + $show(res$5))}
}
