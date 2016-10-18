name := "spark-template"
version := "1.0"
scalaVersion := "2.11.8"

val sparkVersion = "2.0.1"
val sparkTestingBaseVersion = s"${sparkVersion}_0.4.7"

val sparkCoreDep      = "org.apache.spark" %% "spark-core"      % sparkVersion % Provided
val sparkStreamingDep = "org.apache.spark" %% "spark-streaming" % sparkVersion % Provided
val sparkSQLDep       = "org.apache.spark" %% "spark-sql"       % sparkVersion % Provided
val sparkMLlibDep     = "org.apache.spark" %% "spark-mllib"     % sparkVersion % Provided
val sparkGraphXDep    = "org.apache.spark" %% "spark-graphx"    % sparkVersion % Provided

val sparkTestingBaseDep = "com.holdenkarau" %% "spark-testing-base" % sparkTestingBaseVersion % Test

libraryDependencies ++= Seq(
  sparkCoreDep,
//  sparkStreamingDep,
//  sparkSQLDep,
//  sparkMLlibDep,
//  sparkGraphXDep,
  sparkTestingBaseDep
)
