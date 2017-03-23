package example1

import com.github.nscala_time.time.Imports._

object Main14 extends App {
  val today = LocalDate.now()
  val activeUntil = LocalDate.parse("2017-03-23")

  // can the user login to the system?
  println(activeUntil <= today)
}
