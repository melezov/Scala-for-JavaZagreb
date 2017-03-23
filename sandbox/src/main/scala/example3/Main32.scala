package example3

object Main32 extends App {

  class RetryingInt(value: Int) {
    def times(f: => Any) = for (i <- 1 to value) f
  }

  new RetryingInt(3).times {
    println("Retrying Main32 ...")
    Thread.sleep(1000)
  }

  println("Giving up!")
}
