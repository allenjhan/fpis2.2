object IsSorted {
  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    if (as.length <= 1) true
    else if(ordered(as(0), as(1))) isSorted(as.tail, ordered)
    else false
  }

  def main(args: Array[String]): Unit = {
    val myseq1 = Array(0, 1, 2, 3, 4)
    println(isSorted(myseq1, (x: Int, y: Int) => y > x))
    val myseq2 = Array(0, 1, 2, 3, 1)
    println(isSorted(myseq2, (x: Int, y: Int) => y > x))
  }
}
