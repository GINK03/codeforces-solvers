
fun main(args:Array<String>) {
  val (n,k,A,B) = (1..4).map{ readLine()!!.toLong() }
  
  // 1で全部消化するときのコスト
  val step1 = (n-1)*A

  // deviableの時、積極的に割っていくアプローチ
  // kの倍数リストを作成して、ジャンプ計算をできるようにしておく
  var start = n 
  var (dec, div) = Pair(0L,0L)

  val dec_div_start = mutableListOf<Triple<Long,Long,Long>>()
  
  while(true) {
    val amari:Long = start%k;
    dec+=amari
    start-=amari
    div++
    start = start/k
    dec_div_start.add( Triple(dec,div, start) )
    if( start < k || k == 1L) break;
  }
  if ( k != 1L ) { 
    
    val step2 = dec_div_start.map { (dec, div, start) -> 
      (dec+start-1)*A + (div)*B
    }.min()!!
    //println( listOf(step1, step2) )
    println( listOf(step1, step2).min())
  } else {
    println(step1)
  }
}
