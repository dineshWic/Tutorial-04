object Q2 {
  def patternMatching(x: Int): Unit = x match {
    case y if y <= 0 => println("Negative/Zero")
    case y if y % 2 == 0 => println("Even Number")
    case y=> println("Odd Number")

  }

  def main(args: Array[String]):Unit ={
    print("Input a number :")
    val num = readInt()
    patternMatching(num)
  }

}
