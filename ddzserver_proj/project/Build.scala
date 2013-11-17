import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "ddz_proj"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    javaCore,
    "ws.wamplay" %% "wamplay" % "0.2.6-SNAPSHOT"
  )

  playJavaSettings


}
