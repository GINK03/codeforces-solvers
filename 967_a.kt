
fun main(args:Array<String>) {
  val n = readLine()!!
  var ms = readLine()!!.toList().map { it.toString() }.toMutableList()

  l2@while(true) { 
    l1@for( i in (0..ms.size-1-1) ) { 
      //println( ms[i] + ms[i+1] )
      if( ms[i] + ms[i+1] == "01" ) {
        ms[i] = "1"
        ms[i+1] = "0"
        break@l1
      }
      if( i == ms.size-1-1 ) {
        break@l2
      }
    }
    ms = ms.joinToString("").replace("11", "1").toList().map { it.toString() }.toMutableList()
    if( ms.size == 1 ) {
      break@l2
    }
    //println(ms)
  }
  println(ms.joinToString("").replace("1{1,}".toRegex(), "1"))
}
