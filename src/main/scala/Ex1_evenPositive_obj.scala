object Ex1_evenPositive_obj {
  def main(args: Array[String]): Unit = {
    val num = 14
    var evenPos = num > 0 && num%2 ==0
    println(evenPos)
  }
}
