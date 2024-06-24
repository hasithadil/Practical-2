package practical_2

object q2 {

  def main(args:Array[String]):Unit= {
    var a: Int = 2
    var b: Int = 3
    var c: Int = 4
    var d: Int = 5
    var k: Float = 4.3f

    //println( - -b * a + c *d - -);
    println(-(-b) * a + c * d - (-1))

    //println(a++);
    a += 1
    println(a)

    //println (–2 * ( g – k ) +c);

    //println (c=c++);
    c += 1
    println(c)

    //println (c=++c*a++);
    c += 1
    c = c * a
    a += 1
    println(c)
  }
}
