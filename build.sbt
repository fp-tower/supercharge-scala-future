import Dependencies._

lazy val baseSettings: Seq[Setting[_]] = Seq(
  scalaVersion := "2.13.6",
  scalacOptions ++= Seq(
    "-deprecation",
    "-encoding",
    "UTF-8",
    "-feature",
    "-language:higherKinds",
    "-language:implicitConversions",
    "-language:existentials",
    "-language:postfixOps",
    "-unchecked",
    "-Ywarn-value-discard",
  ),
  libraryDependencies ++= Seq(scalatest)
)

lazy val `supercharge-scala-future` = project
  .in(file("."))
  .settings(moduleName := "supercharge-scala-future")
  .settings(baseSettings: _*)
  .aggregate(exercises, answers)
  .dependsOn(exercises, answers)

lazy val exercises = project
  .settings(moduleName := "ssf-exercises")
  .settings(baseSettings: _*)

lazy val answers = project
  .settings(moduleName := "ssf-answers")
  .settings(baseSettings: _*)


addCommandAlias("testAnswers", "answers/test")
