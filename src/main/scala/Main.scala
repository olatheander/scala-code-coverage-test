package com.example

case class Person(name: Option[String])

def pickName(person: Person): String =
  person.name match
    case Some(name) => name
    case None => "No name"

@main def hello: Unit =
  val personName = Person(Some("Bill"))
  val personName2 = Person(None)

  println(pickName(personName))
  println(pickName(personName2))

//   println("Hello world!")
//   println(msg)
//
// def msg = "I was compiled by Scala 3. :)"
