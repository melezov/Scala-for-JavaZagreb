package example5

object Main51 extends App {

  case class Foo(bar: Seq[Long])

  val oneFoo = Foo(Seq(666L))
  println("-" * 50)
  println(oneFoo)                   // Foo(List(666))
  println(oneFoo.bar)               // List(666)
  println(oneFoo.bar.head)          // 666
  println(oneFoo.bar.head.getClass) // long
}
