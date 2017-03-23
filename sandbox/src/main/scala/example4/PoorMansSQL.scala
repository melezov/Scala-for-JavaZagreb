package example4

trait PoorMansSQL { self =>
  object Language {
    val values = Seq("Java", "Scala")
  }

  object SELECT {
    def *(`_`: FROM.type) = new {
      val language = self.Language.values

      def language(`_`: WHERE.type) = new {
        def isScalable = self.Language.values.filter(_ startsWith "Sca")
      }
    }
  }

  object FROM
  object WHERE
}
