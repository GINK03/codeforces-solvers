
fun main(args:Array<String>) {
  val (n,k,A,B) = (1..4).map{ readLine()!!.toLong() }
  
  // 1で全部消化するときのコスト
  val step1 = (n-1)*A

  // deviableの時、積極的に割っていくアプローチ
  
  // kの倍数リストを作成して、ジャンプ計算をできるようにしておく

  var minus1 = 0L
  var devides1 = 0L
  var start = n 
  while(true) {
    start = start/k 
    //println("a $start")
    devides1 ++
    minus1 += start%k
    if( start < k ) {
      println(start)
      //minus1 += start - 1
      break
    }
  }
  println( "${minus1} ${devides1}" )
  val step2 = (minus1)*A + (devides1)*B
  println( listOf(step1, step2).min())
}
