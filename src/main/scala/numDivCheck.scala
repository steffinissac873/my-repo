//Write a Scala program to check if a given number is divisible by either 4 or 6

object numDivCheck {
  def main(args: Array[String]): Unit = {
    val num = 18
    var check = num %4 == 0 || num %2 == 0
    println(check)
  }

}
