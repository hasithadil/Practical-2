package practical_2

object q3 {
  def normalPay(perHour:Double,hours:Int):Double={
    perHour*hours
  }
  def otPay(perHour:Double,hours:Int):Double={
    perHour*hours
  }
  def totalPay(a:Double,b:Int,c:Double,d:Int):Double={
    var normal = normalPay(a,b)
    var ot = otPay(c,d)

    var total = normal+ot
    total
  }
  def tax(a:Double,b:Int,c:Double,d:Int):Double={
    var total = totalPay(a,b,c,d)
    var tax = total * 0.12
    tax
  }
  def netSalary(a:Double,b:Int,c:Double,d:Int):Double={
    var total = totalPay(a,b,c,d)
    var taxx = tax(a,b,c,d)
    total - taxx
  }

  def main(args:Array[String]):Unit={
    var normalWorking = 250
    var normalHours = 40
    var otWorking = 85
    var otHours = 30

    var net = netSalary(normalWorking,normalHours,otWorking,otHours)
    println("Net salary is = "+net)
  }
}
