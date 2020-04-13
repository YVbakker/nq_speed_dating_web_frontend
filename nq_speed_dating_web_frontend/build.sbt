name := """nq_speed_dating_web_frontend"""
organization := "org.nanquanu"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.1"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test

JsEngineKeys.engineType := JsEngineKeys.EngineType.Node

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "org.nanquanu.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "org.nanquanu.binders._"
