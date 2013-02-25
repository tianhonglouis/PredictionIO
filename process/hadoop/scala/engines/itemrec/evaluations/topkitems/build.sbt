import AssemblyKeys._

assemblySettings

name := "TopKItems"

version := "0.2-SNAPSHOT"

scalaVersion := "2.10.0"

libraryDependencies ++= Seq(
  "io.prediction" %% "predictionio-commons" % "0.2-SNAPSHOT",
  "io.prediction" %% "predictionio-output" % "0.2-SNAPSHOT",
  "ch.qos.logback" % "logback-classic" % "1.0.9",
  "ch.qos.logback" % "logback-core" % "1.0.9",
  "com.typesafe" % "config" % "1.0.0",
  "org.clapper" %% "grizzled-slf4j" % "1.0.1",
  "org.rogach" %% "scallop" % "0.8.0"
)

resolvers ++= Seq(
  "Local Maven Repository" at "file://"+Path.userHome.absolutePath+"/.m2/repository"
)
