name := "spark-template"
version := "1.0"
scalaVersion := "2.12.17"

val sparkVersion = "3.4.0"
val sparkTestingBaseVersion = s"${sparkVersion}_1.4.3"

val sparkCoreDep      = "org.apache.spark" %% "spark-core"      % sparkVersion % Provided
val sparkSQLDep       = "org.apache.spark" %% "spark-sql"       % sparkVersion % Provided

val sparkTestingBaseDep = "com.holdenkarau" %% "spark-testing-base" % sparkTestingBaseVersion % Test

libraryDependencies ++= Seq(
  sparkCoreDep,
  sparkSQLDep,
  sparkTestingBaseDep
)
