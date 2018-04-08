
fun main(args:Array<String>) {
  var (a, b) = readLine()!!.split(" ").map{ it.toLong() }

  proc@while(true) {
    if( a == 0L || b == 0L ) break@proc
    
    if( a - 2*b >= 0L ) {
      val n = a/(2*b)
      a = a - 2*n*b
      continue@proc // step1
    }else{
      // step3
      if( b - 2*a >= 0L) {
        val n = b/(2*a)
        b = b - 2*n*a
        continue@proc
      } else {
        break@proc
      }
    }
  }
  println("${a} ${b}")
}
