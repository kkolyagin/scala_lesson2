object app {
  def main(args: Array[String]): Unit = {
    //3a
    var Str="Hello, Scala!"
    //выводит фразу «Hello, Scala!» справа налево
    println(Str.foldLeft(List[Char]()){(x,y)=>y::x}.mkString(""))
    //переводит всю фразу в нижний регистр
    println(Str.toLowerCase)
    // удаляет символ!
    println(Str.replace("!",""))
    //добавляет в конец фразы «and goodbye python!»
    println(Str.replace("!","")+ " and goodbye python!")

    //3b
    val sumTotal: Double = 880
    println("Значение годового дохода: " + sumTotal)
    val sumAward: Double = 56 //% это госслужба до 2023, далее оклады увеличат в 3 раза процент снизят, сумма не изменится.
    println("размер премии в процентах от годового дохода: " + sumAward + " %")
    val sumFoodAllowance: Double = 26.4 //все постоянные ежемесячные доплаты
    println("компенсация питания: " + sumFoodAllowance)
    val oklad = (sumTotal * (1 - sumAward / 100) / 12 - sumFoodAllowance) * 0.87
    printf("Оклад за вычетом ПДН = %.2f", oklad)

    //3c
    


  }
}
