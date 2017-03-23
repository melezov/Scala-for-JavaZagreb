package example7

object Main71 extends App {
  def javaReflectField(value: AnyRef, field: String) =
    value.getClass.getDeclaredField(field).get(value)

  println(javaReflectField(Array(1, 2, 3), "length"))
}
