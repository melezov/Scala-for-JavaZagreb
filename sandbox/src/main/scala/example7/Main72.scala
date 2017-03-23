package example7

object Main72 extends App {
  def javaReflectField(value: AnyRef, field: String) =
    value.getClass.getDeclaredField(field).get(value)

  // patch via java.lang.reflect.Array.getLength required
  println(javaReflectField(Array(1, 2, 3), "length"))
}
