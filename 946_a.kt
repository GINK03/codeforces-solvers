
fun main(args:Array<String>) {
  val n = readLine()!!
  val (A,B) = (0..1).map { mutableListOf<Int>() }
  
  readLine()!!.split(" ").map(String::toInt).map {
    if( it > 0 ) A.add(it) else B.add(it)
  }
  println( A.sum() - B.sum() )
}
