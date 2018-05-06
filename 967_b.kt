
fun main(args:Array<String>) {
  var (n, m, k) = readLine()!!.split(" ").map(String::toLong)
  
  var cur = mutableListOf(1L, 1L)
  var count = 0L
  var ini = false
  // go down
  count += n-1
  cur[0] += n-1
  if(count >= k ) {
    cur[0] = 1 + k
    ini = true
  }
  // go right
  if( ini == false ) {
    count += m-1
    cur[1] += m-1
    if(count >= k ) {
      cur[1] = k - (n-1) + 1
      ini = true
    }
  }
  
  while(true && ini == false) { 
    // go up 
    count += 1
    if(count >= k ) {
      val del = k - count+(1)
      cur[0] = cur[0] - del
      break
    }else{
      cur[0] = cur[0] - 1
    }
    // go left
    count += m-1-1
    if(count >= k ) {
      val del = k - count+(m-1-1)
      cur[1] -= del
      break
    }else{
      cur[1] -= m-1-1
    }

    // go up
    count += 1
    if(count >= k ) {
      val del = k - count+(1)
      cur[0] = cur[0] - del
      break
    }else{
      cur[0] = cur[0] -1
    }
    
    // go right
    count += m-1-1
    if(count >= k ) {
      val del = k - count+(m-1-1)
      cur[1] += del
      break
    }else{
      cur[1] += m-1-1
    }
  }
  println("${cur[0]} ${cur[1]}")
}
