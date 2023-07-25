name := "$name$"

version := "$version$"

scalaVersion := "$scalaVersion$"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "$sparkVersion$" % Provided,
  "org.apache.spark" %% "spark-sql" % "$sparkVersion$" % Provided,
 "org.scalatest" %% "scalatest" % "3.2.15" % "test"
)

// test suite settings
Test / fork := true
//jvm settings
javaOptions ++= Seq("-Xms1024M", "-Xmx2048M", "--add-exports java.base/sun.nio.ch=ALL-UNNAMED")
// Show runtime of tests
Test / testOptions += Tests.Argument(TestFrameworks.ScalaTest, "-oD")
