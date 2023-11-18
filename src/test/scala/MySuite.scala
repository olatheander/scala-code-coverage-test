package com.example

// For more information on writing tests, see
// https://scalameta.org/munit/docs/getting-started.html
class MySuite extends munit.FunSuite {
  // test("example test that succeeds") {
  //   val obtained = 42
  //   val expected = 42
  //   assertEquals(obtained, expected)
  // }

  test("Person test") {
    val personName = Person(Some("Bill"))
    val name = pickName(personName)
    assertEquals(name.name, "Bill")
  }

  test("Person test 2") {
    val personName = Person(None)
    val name = pickName(personName)
    assertEquals(name.name, s"No name")
  }
}
