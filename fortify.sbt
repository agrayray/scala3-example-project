// enable the plugin
addCompilerPlugin(
  "com.lightbend" %% "scala-fortify" % "1.0.22"
    cross CrossVersion.patch)

// configure the plugin
// changed to generic project name
scalacOptions ++= Seq(
  "-P:fortify:scaversion=22.1",
  "-P:fortify:build=myproject"
