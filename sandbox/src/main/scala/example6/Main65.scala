package example6

private[this] object Main65 extends App {
  private[example6] class SB {
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

// https://github.com/melezov/scala-uuid/pull/3
