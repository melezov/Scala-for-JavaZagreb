package example7

import scala.reflect.ClassTag
import scala.reflect.runtime.universe._

object Main73 extends App {
  def scalaReflectMethod[T <: AnyRef : ClassTag](value: T, method: String)(implicit tt: TypeTag[T]) =
    runtimeMirror(getClass.getClassLoader)
      .reflect(value)
      .reflectMethod(tt.tpe.decl(TermName(method)).asMethod)()

  println(scalaReflectMethod(Array(1, 2, 3), "length"))
}
