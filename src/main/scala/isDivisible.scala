//Divisibility by 3 OR 8:

object isDivisible {
  def main(args: Array[String]): Unit = {
    val num = 24
    var numberCheck = num % 3==0 || num % 8==0
    println(numberCheck)
  }

}
