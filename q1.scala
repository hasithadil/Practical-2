package practical_2

object q1 {

  def main(args:Array[String]):Unit={
    var k,i,j = 2;
    var m,n = 5;
    var f = 12.0f;
    var g = 4.0f;
    var c = 'X';

    var q1 = k + 12 * m;
    var q2 = m / j;
    var q3 = n%j;
    var q4 = m/j*j;
    var q5 = f+10*5+g;

    // ++ operator is not available in scala
    //var q6 = ++i*n
    i = i+1;
    var q6 = i*n;

    println("k + 12 * m = " + q1)
    println("m/j = "+q2)
    println("n%j = "+ q3)
    println("m/j*j = "+q4)
    println("f+10*5+g = "+q5)
    println("++i*n = error.++ operator not available")
  }

}
