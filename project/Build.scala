import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName = "Scarlet"
  val appVersion = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    "com.claydonkey" %% "ean" % "1.0-SNAPSHOT"
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    resolvers += Resolver.url("Claydonkey Play Repository", url("http://claydonkey.github.io/snapshots/"))(Resolver.ivyStylePatterns)
  )

}
