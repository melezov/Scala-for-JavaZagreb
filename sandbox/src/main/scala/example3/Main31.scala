package example3

object Main31 extends App {

  for (i <- 1 to 3) {
    println("Retrying Main31 ...")
    Thread.sleep(1000)
  }

  println("Giving up!")
}
