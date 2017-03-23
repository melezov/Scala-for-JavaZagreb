package example7

import java.awt.geom.Point2D

import scala.reflect.runtime.universe._

object Main76 extends App {
  def `what am I what have you done to me`[T](value: T)(implicit tt: TypeTag[T]): (String, String) = {
    (value.toString, tt.tpe.toString)
  }

  println(`what am I what have you done to me`(1))
  println(`what am I what have you done to me`(Map("aoeu" -> org.joda.time.DateTime.now)))
  println(`what am I what have you done to me`(Map.empty[Set[List[Int]], Point2D.Double]))
}
