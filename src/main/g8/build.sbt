name := "$name$"

version := "$version$"

scalaVersion := "$scalaVersion$"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "$sparkVersion$" % Provided,
  "org.apache.spark" %% "spark-sql" % "$sparkVersion$" % Provided,
 "org.scalatest" %% "scalatest" % "3.2.15" % "test"
)
