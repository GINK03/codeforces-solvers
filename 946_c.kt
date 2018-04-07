
fun main(args:Array<String>) {
  val a = "abcdefghijklmnopqrstuvwxyz".toList().map { it.toString() }
  val ms = a.mapIndexed { index, char -> 
    val s = when {
      index == 25 -> mutableSetOf(char)
      else -> mutableSetOf(char, a[index+1])
    }
    Pair(char, s)
  }.toMap()

  val inputOrg = readLine()!!
  val input = inputOrg.toList().map { it.toString() }
  // search for sequence 24 yes! 
  val tr = input.map { char ->
    val s = ms[char] 
    s
  }

  var (cur,result) = Pair(0, false)
  for( i in (0..tr.size - 26) ) {
    //println( tr.slice(i..i+25).size )
    val res = tr.slice(i..i+25).zip(a).all { pair ->
      val (a,b) = pair 
      a!!.contains(b)
    } 
    if( res == true ) {
      cur = i
      result = true
      break
    }
  }
  if( result == false ) {
    println("-1")
  } else {
    println( inputOrg.replaceRange( cur, cur+26, "abcdefghijklmnopqrstuvwxyz") ) 
  }
}
