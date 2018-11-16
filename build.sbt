lazy val root = (project in file(".")).
  settings(
    name := "SBT_Example",
    version := "1.1-SNAPSHOT",
    scalaVersion := "2.11.4"
  )

enablePlugins(JavaAppPackaging)

resolvers ++= Seq(
  "typesafe" at "https://repo.scala-sbt.org/scalasbt/sbt-plugin-releases/",
  "sonatype-oss-public" at "https://oss.sonatype.org/content/groups/public/"
)
