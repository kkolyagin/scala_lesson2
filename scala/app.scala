object app {
  def main(args: Array[String]): Unit = {
    var Str="Hello, Scala!"
    //выводит фразу «Hello, Scala!» справа налево
    println(Str.foldLeft(List[Char]()){(x,y)=>y::x}.mkString(""))
    //переводит всю фразу в нижний регистр
    println(Str.toLowerCase)
    // удаляет символ!
    println(Str.replace("!",""))
    //добавляет в конец фразы «and goodbye python!»
    println(Str.replace("!","")+ " and goodbye python!")

    println("Введите:\nзначение годового дохода:")
    val sumTotal = scala.io.StdIn.readInt()
    println("размер премии в процентах от годового дохода:")
    val sumAward = scala.io.StdIn.readInt()
    println("компенсация питания:")
    val sumFoodAllowance = scala.io.StdIn.readInt()




  }
}
