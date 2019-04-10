lazy val mainProject = Project(id = "play-scala-hello-world-tutorial", base = file("."))
  .settings(
    sharedSettings ++ Seq(
      name := "play-scala-hello-world-tutorialsbt",
      organization := "com.example",
      version := "1.0-SNAPSHOT"))
  .enablePlugins(PlayScala)

val sharedSettings = Defaults.coreDefaultSettings ++ Seq(
  scalaVersion := "2.12.8",
  crossScalaVersions := Seq("2.12.6", "2.11.12"),
  libraryDependencies ++= Seq(
    guice,
    "org.scalatestplus.play" %% "scalatestplus-play" % "4.0.1" % Test))
