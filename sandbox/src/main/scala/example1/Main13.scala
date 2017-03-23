package example1

import org.joda.time.LocalDate

object Main13 extends App {
  val today = LocalDate.now()
  val activeUntil = LocalDate.parse("2017-03-23")

  // can the user login to the system?
  println(!activeUntil.isAfter(today))
  println(activeUntil.isBefore(today) || activeUntil.equals(today))

  import com.github.nscala_time.time.Imports._
  println(activeUntil <= today)
}
