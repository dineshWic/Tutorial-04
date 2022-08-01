object Q3 {
  def toUpper(text:String):String=text.toUpperCase()
  def toLower(text:String):String=text.toLowerCase()

  def formatNames(name:String)(indexList:Int*)(function :String=>String):String = {
    if(indexList.isEmpty){
      return function(name)
    }
    var temp =""
    var i = 0
    while (i<name.length()){
      if(indexList.contains(i)) temp = temp+function(name.charAt(i).toString)
      else temp = temp + name.charAt(i).toString
      i = i + 1
    }
    temp
  }
  def main(args: Array[String]): Unit = {
    println(formatNames("Benny")()(toUpper))
    println(formatNames("Niroshan")(0,1)(toUpper))
    println(formatNames("Saman")()(toLower))
    println(formatNames("Kumara")(5)(toUpper))
  }


}
