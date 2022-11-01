object app {
  def main(args: Array[String]): Unit = {
    //3a
    var Str="Hello, Scala!"
    //выводит фразу «Hello, Scala!» справа налево
    //println(Str.foldLeft(List[Char]()){(x,y)=>y::x}.mkString(""))
    println(Str.reverse)
    //переводит всю фразу в нижний регистр
    println(Str.toLowerCase)
    // удаляет символ!
    println(Str.replace("!",""))
    //добавляет в конец фразы «and goodbye python!»
    println(Str.replace("!","")+ " and goodbye python!")

    //3b
    val sumTotal: Double= 880
    println("\nЗначение годового дохода: " + sumTotal)
    val sumAward: Double = 56 //% это госслужба до 2023, далее оклады увеличат в 3 раза процент снизят, сумма не изменится.
    println("размер премии в процентах от годового дохода: " + sumAward + " %")
    val sumFoodAllowance: Double = 26.4 //все постоянные ежемесячные доплаты
    println("компенсация питания: " + sumFoodAllowance)
    var oklad = (sumTotal * (1 - sumAward / 100) / 12 - sumFoodAllowance) * 0.87
    oklad="%.3f".format(oklad).replace(",",".").toDouble
    println(s"Оклад за вычетом ПДН = $oklad")

    //3c
    var Employees = scala.collection.mutable.Map[Char,Double]('a' -> 100.0, 'b' -> 150.0, 'c' -> 200.0, 'd' -> 80.0, 'e' -> 120.0, 'f' -> 75.0)
    Employees+=('g'->oklad)

    var sum: Double = 0
    for ((key, value) <- Employees) sum += value
    var mid: Double = sum / Employees.size
    println(f"\nОтклонение от среднего значение оклада $mid%.2f:")
    for ((key, value) <- Employees) {
      val otkl = (value - mid) / mid * 100
      println(f"$key : $otkl%.2f %% \t($value)")
    }

    //3d
    Employees('g')-=Employees('g')-mid //уравниваю зарплату сотрудника к средней
    println(s"Самая высокая зарплата =  ${Employees.values.max}")
    println(s"Самая низкая зарплата =  ${Employees.values.min}")

    //3e
    Employees+=('h'-> 350)
    Employees+=('i'-> 90)
    var Employees1=Employees.toSeq.sortBy(_._2)
    for (i <- Employees1.iterator) println(i)
  }
}
