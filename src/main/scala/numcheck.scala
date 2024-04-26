//Divisibility by 5 AND 7
object numcheck {
  def main(args: Array[String]): Unit = {
    val num = 35
    var divCheck = num % 5 == 0 && num %7 == 0
    print(divCheck)
  }

}
