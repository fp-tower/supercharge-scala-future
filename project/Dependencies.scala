import sbt._

object Dependencies {
  val scalatest     = "org.scalatestplus" %% "scalacheck-1-14" % "3.2.2.0" % Test
  val kindProjector = "org.typelevel"     %% "kind-projector"  % "0.10.3" cross CrossVersion.binary
}
