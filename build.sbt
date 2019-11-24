name := """play-test"""
organization := "play-test"

version := "1.0-SNAPSHOT"

scalaVersion := "2.13.1"

libraryDependencies += guice


lazy val root = (project in file(".")).enablePlugins(PlayJava)
  .aggregate(play_test_sub)
  .dependsOn(play_test_sub)

lazy val play_test_sub = (project in file("./module/play-test-sub")).enablePlugins(PlayJava)
