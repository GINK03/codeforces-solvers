
fun solve(n:Long, m:Long, k:Long):Long? {
  var ret:Long? = 0L
  if( k == 0L )
    ret = n * m
  else if( (n-1) + (m-1) < k )
    ret = -1
  else {
    val shortSide = listOf(n, m).max()
    val longSide = listOf(n, m).max()

    // 両方の辺を割らないといけない場合
    if( longSide!! < (k+1) ) {
      ret = listOf( solve(1, m, (k + 1) - n)!!, solve(n, 1, (k + 1) - m)!! ).max()
    }
    // 片方向からだけ割って、大きい方を採用
    else {
      val nCut = ( n / (k+1) ) * m
      val mCut = ( m / (k+1) ) * n
      ret = listOf(nCut, mCut).max()
    }
  }
  return ret
}

fun main(args:Array<String>) {
  val (n,m,k) = readLine()!!.split(" ").map { it.toLong() } 
  println( solve(n,m,k) )
}
