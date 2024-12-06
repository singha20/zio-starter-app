import sbt._

object Library {

  object Version {}

  object Dependency {

    val scalaTest     = "org.scalatest" %% "scalatest"       % "3.2.15"
    val novoCodeJunit = "com.github.sbt" % "junit-interface" % "0.13.3"
  }

  import Dependency._

  val testDependencies = Seq(
    scalaTest,
    novoCodeJunit
  ).map(c => c % "test")

}
