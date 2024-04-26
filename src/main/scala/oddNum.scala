object oddNum {
  def main(args: Array[String]): Unit = {
    val num = 27
    var oddNumber = num %2 != 0 && num %3 == 0
    println(oddNumber)
  }

}
