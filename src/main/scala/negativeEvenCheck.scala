// Check for Non-Negative OR Even Number
object negativeEvenCheck {
    def main(args: Array[String]): Unit = {
      val num = -7
      var numCheck = num < 0 || num % 2==0
      println(numCheck)
    }
}
