name := "groot"

version := "0.1"

scalaVersion := "2.13.5"

val typesafeConfigVersion = "1.4.1"
val slf4jVersion = "1.7.30"

libraryDependencies ++= Seq(
  "com.typesafe" % "config" % typesafeConfigVersion,
  "org.slf4j" % "slf4j-nop" % slf4jVersion,
)
