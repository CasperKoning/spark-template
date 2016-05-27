name := "spark-template"

version := "1.0"

scalaVersion := "2.11.8"

val sparkVersion = "1.6.0"

val sparkCoreDep = "org.apache.spark" %% "spark-core" % sparkVersion % Provided

libraryDependencies ++= Seq(
  sparkCoreDep
)
