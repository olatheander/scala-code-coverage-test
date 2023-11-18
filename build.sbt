val scala3Version = "3.3.1"

val commonSettings = Seq(
  // Test / testOptions += Tests.Argument(
  //   TestFrameworks.ScalaCheck,
  //   "-verbosity",
  //   "10",
  //   "-workers",
  //   "1",
  //   "-minSuccessfulTests",
  //   "100"
  // ),
  // Test / testOptions += Tests.Argument(TestFrameworks.ScalaTest, "-oD"),
  // coverageExcludedFiles := {
  //   (coverageExcludedFiles.value.split(';').filter(_.nonEmpty) ++
  //     (Compile / managedSourceDirectories).value
  //       .map(f =>
  //         (f.absolutePath + Path.sep + ".*").replaceAllLiterally("/", "\\/")
  //       )).mkString(";")
  // },
  // jacocoReportSettings := JacocoReportSettings(
  //   formats =
  //     if (coverageEnabled.value)
  //       Seq(JacocoReportFormats.ScalaHTML, JacocoReportFormats.XML)
  //     else Nil
  // ),
  // jacocoIncludes := {
  //   if (coverageEnabled.value) Seq("*") else Seq()
  // },
  // jacocoExcludes := {
  //   if (coverageEnabled.value) Seq("**.macros.**") else Seq("*")
  // },
  // jacocoInstrumentationIncludes := {
  //   if (coverageEnabled.value) Seq("*") else Seq()
  // },
  // jacocoInstrumentationExcludes := {
  //   if (coverageEnabled.value) Seq("**.macros.**") else Seq("*")
  // },
  // target := (ThisBuild / baseDirectory).value / "target" / baseDirectory.value.name
).flatten

lazy val root = project
  .in(file("."))
  .settings(commonSettings)
  .settings(
    name := "Scala Code Coverage Test",
    version := "0.1.0-SNAPSHOT",
    // coverageEnabled := true,
    coverageOutputDebug := true,
    coverageHighlighting := true,
    coverageFailOnMinimum := false,
    coverageMinimumStmtTotal := 70,
    coverageMinimumBranchTotal := 70,
    coverageMinimumStmtPerPackage := 70,
    coverageMinimumBranchPerPackage := 70,
    coverageMinimumStmtPerFile := 70,
    coverageMinimumBranchPerFile := 70,
    Test / publishArtifact := false,
    Test / parallelExecution := false,
    scalaVersion := scala3Version,
    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
  )
