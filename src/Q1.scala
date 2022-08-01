object Q1 {
  def calculateInterest(amount:Double):Double=amount match {
    case x if x <= 20000    => x*0.02
    case x if x <= 200000   => x*0.04
    case x if x <= 2000000  => x*0.035
    case x => x * 0.06
  }
  def main(args: Array[String]):Unit={
    println(calculateInterest(10000))
    println(calculateInterest(100000))
    println(calculateInterest(1000000))
    println(calculateInterest(10000000))
  }

}
