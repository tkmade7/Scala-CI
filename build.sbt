enablePlugins(JavaAppPackaging)

resolvers ++= Seq(
  "typesafe" at "https://repo.scala-sbt.org/scalasbt/sbt-plugin-releases/",
  "sonatype-oss-public" at "https://oss.sonatype.org/content/groups/public/"
)
