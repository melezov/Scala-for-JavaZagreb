package example3

object Main34 extends App {

  implicit class RetryingInt(val value: Int) extends AnyVal {
    def times(f: => Any) = for (i <- 1 to value) f
  }

  3 times {
    println("Retrying Main34 ...")
    Thread.sleep(1000)
  }

  println("Giving up!")
}
