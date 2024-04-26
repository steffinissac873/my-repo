//Eligibility for Senior Discount OR Student Discount:
object seniorPersonCheck {
  def main(args: Array[String]): Unit = {
    val age = 60
    var ageCheck = age > 60 || age < 25
    println(ageCheck)
  }

}
