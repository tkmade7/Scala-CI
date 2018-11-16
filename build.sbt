resolvers ++= Seq(
  "typesafe" at "https://repo.scala-sbt.org/scalasbt/sbt-plugin-releases/",
  "sonatype-oss-public" at "https://oss.sonatype.org/content/groups/public/"
)
name := "samplescala"

version := "0.1"

scalaVersion := "2.12.5"

lazy val root = (project in file(".")).enablePlugins(JavaAppPackaging)

//rename zip file created from `dist` command
packageName in Universal := "samplescala"
