import play.Project._

name := "Scarlet"

version := "1.0-SNAPSHOT"

organization := "com.claydonkey"

libraryDependencies ++= Seq(
   "com.claydonkey" %% "ean" % "1.0.1"
)     

resolvers += Resolver.url("Claydonkey Play Repository", "http://claydonkey.github.io/releases/")(Resolver.ivyStylePatterns)

playScalaSettings
