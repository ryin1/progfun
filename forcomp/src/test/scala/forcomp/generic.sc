package forcomp

object generic {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  def removeAt[T](n: Int, xs: List[T]): List[T] = xs match {
  	case List() => xs
  	case y :: ys => if (n == 0) ys
  									else y :: removeAt(n - 1, ys)
  	}                                         //> removeAt: [T](n: Int, xs: List[T])List[T]
  	
 	removeAt(1, List('a', 'b', 'c', 'd'))     //> res0: List[Char] = List(a, c, d)
}