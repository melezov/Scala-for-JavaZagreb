package example6

object Main63 extends App {
  class SB {
    private[this] val sb = new java.lang.StringBuilder

    def +(text: String): this.type = {
      sb.append(text)
      this
    }

    def -(number: Int): this.type = {
      sb.append("[[").append(number).append("]]")
      this
    }

    override def toString = sb.toString
  }

  println(new SB + "Sretna nova " - 2018 + "!")
}
