package example7

import scala.reflect.runtime.universe._

object Main74 extends App {
  def `what am I what have you done to me`[T](value: T)(implicit tt: TypeTag[T]): (String, String) = {
    (value.toString, tt.tpe.toString)
  }

  println(`what am I what have you done to me`(1))
}
