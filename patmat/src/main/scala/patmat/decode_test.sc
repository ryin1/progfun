package patmat

import patmat.Huffman._



object decode_test {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val chars = string2Chars("Hello world")         //> chars  : List[Char] = List(H, e, l, l, o,  , w, o, r, l, d)
	println(makeOrderedLeafList(times(chars)))//> List(Leaf(H,1), Leaf(e,1), Leaf( ,1), Leaf(w,1), Leaf(r,1), Leaf(d,1), Leaf(
                                                  //| o,2), Leaf(l,3))
	println(createCodeTree(chars))            //> Fork(Fork(Leaf(r,1),Leaf(d,1),List(r, d),2),Fork(Leaf( ,1),Leaf(w,1),List( ,
                                                  //|  w),2),List(r, d,  , w),4)
	val t2 = Fork(Fork(Leaf('a',2), Leaf('b',3), List('a','b'), 5), Leaf('d',4), List('a','b','d'), 9)
                                                  //> t2  : patmat.Huffman.Fork = Fork(Fork(Leaf(a,2),Leaf(b,3),List(a, b),5),Leaf
                                                  //| (d,4),List(a, b, d),9)
	val e = encode(t2)(List('a'))             //> e  : List[patmat.Huffman.Bit] = List(0, 0)
	
	val d = decode(t2, e)                     //> d  : List[Char] = List(a)
	val t = convert(t2)                       //> t  : patmat.Huffman.CodeTable = List((a,List(0, 0)), (b,List(0, 1)), (d,List
                                                  //| (1)))
	
}