package patmat

import patmat.Huffman._



object decode_test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(107); 
  println("Welcome to the Scala worksheet");$skip(42); 
  val chars = string2Chars("Hello world");System.out.println("""chars  : List[Char] = """ + $show(chars ));$skip(44); 
	println(makeOrderedLeafList(times(chars)));$skip(32); 
	println(createCodeTree(chars));$skip(100); 
	val t2 = Fork(Fork(Leaf('a',2), Leaf('b',3), List('a','b'), 5), Leaf('d',4), List('a','b','d'), 9);System.out.println("""t2  : patmat.Huffman.Fork = """ + $show(t2 ));$skip(31); 
	val e = encode(t2)(List('a'));System.out.println("""e  : List[patmat.Huffman.Bit] = """ + $show(e ));$skip(25); 
	
	val d = decode(t2, e);System.out.println("""d  : List[Char] = """ + $show(d ));$skip(21); 
	val t = convert(t2);System.out.println("""t  : patmat.Huffman.CodeTable = """ + $show(t ))}
	
}
