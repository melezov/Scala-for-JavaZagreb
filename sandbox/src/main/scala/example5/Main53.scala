package example5

object Main53 extends App {

  case class Foo(bar: Seq[Long])

  val oneFoo = Foo(Seq(666L))
  println("-" * 50)
  println(oneFoo)                   // Foo(List(666))
  println(oneFoo.bar)               // List(666)
  println(oneFoo.bar.head)          // 666
  println(oneFoo.bar.head.getClass) // long

  // json do your worst
  val objectMapper = new ObjectMapper().registerModule(DefaultScalaModule)

  val serializedFoo = objectMapper.writeValueAsString(oneFoo)
  println("-" * 50)
  println(serializedFoo) // {"bar":[666]}

  val deserializedFoo = objectMapper.readValue(serializedFoo, classOf[Foo])
  println("-" * 50)
  println(deserializedFoo)                    // Foo(List(666))
  println(deserializedFoo.bar)                // List(666)
  println(deserializedFoo.bar.head)           // 666
  println(deserializedFoo.bar.head.getClass)  // long
}
