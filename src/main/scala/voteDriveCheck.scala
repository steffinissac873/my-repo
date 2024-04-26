//Create a Scala program to check if a person is eligible to vote (age greater than or equal to 18) or
//eligible to drive (age greater than or equal to 16).

object voteDriveCheck {
  def main(args: Array[String]): Unit = {
    val age = 20
    var ageCheck = age >= 18 || age >= 16
    println(ageCheck)
  }

}
