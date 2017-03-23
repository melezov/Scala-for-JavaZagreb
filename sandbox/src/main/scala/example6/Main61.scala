package example6

object Main61 extends App {
  class SB {
    val sb = new java.lang.StringBuilder

    def +(text: String): SB = {
      sb.append(text)
      this
    }

    def -(number: Int): SB = {
      sb.append("[[").append(number).append("]]")
      this
    }

    override def toString = sb.toString
  }

  println(new SB + "Sretna nova " - 2018 + "!")
}
