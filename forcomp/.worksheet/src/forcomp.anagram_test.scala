package forcomp
import forcomp.Anagrams._

object anagram_test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(85); 
	val word = "asdfas";System.out.println("""word  : String = """ + $show(word ));$skip(63); val res$0 = 
	(word groupBy (x => x)) map { case (k, v) => (k -> v.length)};System.out.println("""res0: scala.collection.immutable.Map[Char,Int] = """ + $show(res$0))}

  }
