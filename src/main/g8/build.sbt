// give the user a nice default project!
lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.11.8"
    )),
    name := "scala-corenlp",

    libraryDependencies += "edu.stanford.nlp" % "stanford-corenlp" % "3.9.2"
  )
