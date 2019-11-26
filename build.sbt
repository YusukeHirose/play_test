//ThisBuild / organization := "play-test"
//ThisBuild / version := "0.1.0-SNAPSHOT"
//ThisBuild / scalaVersion := "2.13.1"


name := """play-test"""
organization := "play-test"

version := "1.0-SNAPSHOT"

scalaVersion := "2.13.1"

libraryDependencies += guice


lazy val root = (project in file(".")).enablePlugins(PlayJava)
  .aggregate(sub)
  .dependsOn(sub % "compile->compile")

lazy val sub = (project in file("module/play-test-sub")).enablePlugins(PlayJava)

// ↓ 下記を追加すると最初からsubのrouteを見に行く
//PlayKeys.devSettings += ("play.http.router", "sub.Routes")

