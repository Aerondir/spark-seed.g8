name := "$name$"

version := "$version$"

scalaVersion := "$scalaVersion$"

libraryDependencies += "org.apache.spark" %% "spark-core" % "$sparkVersion$" % Provided
libraryDependencies += "org.apache.spark" %% "spark-sql" % "$sparkVersion$" % Provided

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.9" % "test"

// test suite settings
Test / fork := true
//jvm settings
javaOptions ++= Seq("-Xms512M", "-Xmx2048M", "-XX:+UseContainerSupport")
// Show runtime of tests
Test / testOptions += Tests.Argument(TestFrameworks.ScalaTest, "-oD")

// JAR file settings

// don't include Scala in the JAR file
//assemblyOption in assembly := (assemblyOption in assembly).value.copy(includeScala = false)

// Add the JAR file naming conventions described here: https://github.com/MrPowers/spark-style-guide#jar-files
// You can add the JAR file naming conventions by running the shell script
