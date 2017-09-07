import Dependencies._

name := "scaffeine"

organization := "com.github.blemale"

licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0"))

description := "Thin Scala wrapper for Caffeine."

startYear := Some(2016)

homepage := Some(url("https://github.com/blemale/scaffeine"))

scalaVersion := "2.12.3"

libraryDependencies ++=
  Seq(
    Caffeine,
    Java8Compat,
    Jsr305 % "provided",
    Scalactic % "test",
    Scalatest % "test"
  )
