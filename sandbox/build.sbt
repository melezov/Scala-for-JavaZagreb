scalaVersion := "2.12.1"

libraryDependencies ++= Seq(
  "com.github.nscala-time"       %% "nscala-time"          % "2.16.0" // example1

, "com.typesafe.scala-logging"   %% "scala-logging"        % "3.5.0"  // example2
, "ch.qos.logback"               %  "logback-classic"      % "1.2.2"

, "io.jvm.uuid"                  %% "scala-uuid"           % "0.2.2"  // example4
, "org.scala-lang.modules"       %% "scala-xml"            % "1.0.6"

, "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.8.7"  // example5

, "org.scala-lang"               %  "scala-reflect"        % scalaVersion.value // "example7
)
