// Check for Negative AND Odd Number

object negativeOddCheck {
  def main(args: Array[String]): Unit = {
    val num = -7
    var numCheck = num <0 && num % 3 ==0
    println(numCheck)
  }

}
