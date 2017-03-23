package example1

import org.joda.time.LocalDate

object Main11 extends App {
  val today = LocalDate.now()
  val activeUntil = LocalDate.parse("2017-03-23")

  // can the user login to the system?
  println(!activeUntil.isAfter(today))
}
