package forcomp

object generic {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(77); 
  println("Welcome to the Scala worksheet");$skip(162); 
  def removeAt[T](n: Int, xs: List[T]): List[T] = xs match {
  	case List() => xs
  	case y :: ys => if (n == 0) ys
  									else y :: removeAt(n - 1, ys)
  	};System.out.println("""removeAt: [T](n: Int, xs: List[T])List[T]""");$skip(44); val res$0 = 
  	
 	removeAt(1, List('a', 'b', 'c', 'd'));System.out.println("""res0: List[Char] = """ + $show(res$0))}
}
