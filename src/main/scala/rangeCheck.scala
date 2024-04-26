//Create a Scala program to determine if a given value is either less than -10 or greater than 10.

object rangeCheck {
  def main(args: Array[String]): Unit = {
    val num = -15
    var lessGreater = num < -10 || num > 10
    println(lessGreater)

  }


}
