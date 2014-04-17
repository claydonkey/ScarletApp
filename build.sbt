import play.Project._

name := "ScarletApp"

version := "1.0-SNAPSHOT"

organization := "com.claydonkey"

resolvers += Resolver.url("Claydonkey Play Repository", url("http://claydonkey.github.io/releases/"))(Resolver.ivyStylePatterns)

libraryDependencies ++= Seq("com.claydonkey" %% "ean" % "1.0.1")  

playScalaSettings
