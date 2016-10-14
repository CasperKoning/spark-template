name := "spark-template"

version := "1.0"

scalaVersion := "2.11.8"

val sparkVersion = "2.0.1"

val sparkCoreDep = "org.apache.spark" %% "spark-core" % sparkVersion % Provided

libraryDependencies ++= Seq(
  sparkCoreDep
)
