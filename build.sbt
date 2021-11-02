import Dependencies._

ThisBuild / scalaVersion := "2.13.7"
ThisBuild / libraryDependencies := Seq(scalatest)
ThisBuild / scalacOptions := Seq(
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
)

lazy val `supercharge-scala-future` = project
  .in(file("."))
  .settings(moduleName := "supercharge-scala-future")
  .aggregate(exercises, answers)
  .dependsOn(exercises, answers)

lazy val exercises = project
  .settings(moduleName := "ssf-exercises")

lazy val answers = project
  .settings(moduleName := "ssf-answers")


addCommandAlias("testAnswers", "answers/test")
