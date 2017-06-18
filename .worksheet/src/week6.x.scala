package week6

import scala.io.Source

object x {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(161); 
  val in = Source.fromURL("http://lamp.epfl.ch/files/content/sites/lamp/files/teaching/progfun/linuxwords.txt");System.out.println("""in  : scala.io.BufferedSource = """ + $show(in ));$skip(84); 
  val words = in.getLines.toList filter (word => word forall (chr => chr.isLetter));System.out.println("""words  : List[String] = """ + $show(words ));$skip(144); 
  val mnem = Map(
    '2' -> "ABC", '3' -> "DEF", '4' -> "GHI",
    '5' -> "JKL", '6' -> "MNO", '7' -> "PQRS",
    '8' -> "TUV", '9' -> "WXYZ");System.out.println("""mnem  : scala.collection.immutable.Map[Char,String] = """ + $show(mnem ));$skip(175); 
  // Invert the mnem map to give a map from chars 'A' ... 'Z' to '2' ... '9'
  val charCode: Map[Char, Char] =
    for ((digit, str) <- mnem; ltr <- str) yield (ltr -> digit);System.out.println("""charCode  : Map[Char,Char] = """ + $show(charCode ));$skip(151); 

  // Maps a word to the digit string it can represent, e.g. "Java" -> "5282"
  def wordCode(word: String): String =
    word.toUpperCase map charCode;System.out.println("""wordCode: (word: String)String""");$skip(304); 

  // A map from digit strings to the words that represent them,
  // e.g. "5282" -> List("Java", "Kata", "Lava", ...).
  // Note that a missing number should map to the empty set,
  // e.g. "1111" -> List()
  val wordsForNum: Map[String, Seq[String]] =
    words groupBy wordCode withDefaultValue Seq();System.out.println("""wordsForNum  : Map[String,Seq[String]] = """ + $show(wordsForNum ));$skip(332); 

  // Return all ways to encode a number s a list of words
  def encode(number: String): Set[List[String]] =
    if (number.isEmpty) Set(List())
    else {
      for {
        split <- 1 to number.length
        word <- wordsForNum(number take split)
        rest <- encode(number drop split)
      } yield word :: rest
    }.toSet;System.out.println("""encode: (number: String)Set[List[String]]""");$skip(88); 

  def translate(number: String): Set[String] =
    encode(number) map (_ mkString "-");System.out.println("""translate: (number: String)Set[String]""");$skip(53); val res$0 = 
    
  // Testing it works
  translate("7225247386");System.out.println("""res0: Set[String] = """ + $show(res$0))}
   
}
