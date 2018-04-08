
fun main(args:Array<String>) {
  val (m,n) = readLine()!!.split(" ").map(String::toInt)

  val target = readLine()!!.split(" ").map(String::toInt).sorted()

  val ansbox = mutableListOf<Pair<Int,Int>>()
  
  for( start in (0..target.size-1) ) {
    for( end in (start..target.size-1) ) {
      val delta = target[end] - target[start]
      if( n >= delta ) {
        val ans = target.size - (end-start + 1)
        ansbox.add(Pair(delta, ans))
      }
    }
  }
  //println(ansbox)
  if(ansbox.minBy{ it.second } == null)
    if( m <= n ) 
      println(0)
    else if( n >= 1 ) 
      println(target.size - 1)
    else
      println(0)
  else
    println(ansbox.minBy{ it.second }!!.second)
}
