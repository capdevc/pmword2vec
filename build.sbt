name := "PMWord2Vec"

organization := "PYA Analytics"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies ++=  Seq(
  "org.apache.spark" %% "spark-core" % "1.4-SNAPSHOT" % "provided",
  "org.apache.spark" %% "spark-mllib" % "1.4-SNAPSHOT" % "provided",
  "org.apache.hadoop" % "hadoop-client" % "2.4.0" % "provided",
  "com.github.scopt" %% "scopt" % "3.2.0"
)
