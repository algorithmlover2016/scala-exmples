// Array
val greetingString = new Array[String](3)
// val greetingString : Array[String] = new Array[String](3)
greetingString(0) = "Hello "
// greetingString.update(0, "Hello ")
greetingString(1) = "new commer"
greetingString(2) = "!, you can work much harder"
for (index <- 0 to greetingString.length - 1) {
// for (index <- (0).to(greetingString.length - 1)) {
  println(greetingString(index))
  // println(greetingString.apply(index))
  Console println greetingString(index)
}

val numsArray : Array[String] = new Array[String](3)
numsArray(0) = "zero"
numsArray(1) = "one"
numsArray(2) = "two"
for (numStr <- numsArray) {
  println(numStr)
}

val nums = Array(10, 20, 30)
// val nums = Array.apply(10, 20, 30)
nums(0) = 40
nums(1) = 50
nums(2) = 60
nums.foreach(println)
// Array

// List
val numList = List(20, 40, 50)
numList.foreach(println)
// error: value :: is not a member of String
// val numStrList = "one" :: "two" :: "three"
val numStrList = "one" :: "two" :: "three" :: Nil
println(numStrList.mkString(", "))
val otherStrList = "four" :: "five" :: "six" :: Nil
// error: value ::: is not a member of String
// println(numStrList:::otherStrList.mkString(", "))
println((numStrList:::otherStrList).mkString(", "))
val concatenationStrList = numStrList:::otherStrList
concatenationStrList foreach println
// concatenationStrList.foreach(println)
// List

// SET && MAP
// Set HashSet
var defaultImmutableSet = Set("I ", "am ", "regret ")
// if define with val, value += is not a member of scala.collection.immutable.Set[String]
defaultImmutableSet += "from "
defaultImmutableSet += "my "
defaultImmutableSet += "heart"
defaultImmutableSet foreach print
println

import scala.collection.mutable
var mutableSet = mutable.Set("Can ", "I ", "change ")
mutableSet += "the "
// mutableSet.+=("the ")
mutableSet += "result?"
mutableSet foreach print
println

val stringBuffer = new StringBuilder;
/*
type mismatch;
 found   : String("no matter how smart you feel you are, ")
 required: Char
 */
// stringBuffer += "no matter how smart you feel you are, "
stringBuffer ++= "no matter how smart you feel you are, "
stringBuffer ++= "if you do not know the nature about life and death, "
stringBuffer ++= "you are stupid indeedy!"
stringBuffer += '\n'

// MAP
var defaultImmutableMap = Map[Int, String](1 -> "no one will die.",
                                           2 -> "everybody will live forever.",
                                           3 -> "no matter how smart you feel you are, ".concat(
                                           "if you do not know the nature about life and death, ").concat(
                                           "you are stupid indeedy"),
                                           4 -> stringBuffer.toString,

                                           // must put the strings in parentheses,
                                           // "->" is priority over "+"
                                           6 -> ("no matter how smart you feel you are, " +
                                           "if you do not know the nature about life and death, " +
                                           "you are stupid indeedy"),
                                           )
// String has no method named "+"
// error: ';' expected but ')' found.
defaultImmutableMap.foreach{case (key : Int, value : String) => println(key + ": " + value)}
defaultImmutableMap.foreach((ele : (Int, String)) => println(ele._1 + ": " + ele._2))

/* error: value += is not a member of scala.collection.immutable.Map[Int,String]
  Expression does not convert to assignment because receiver is not assignable.
  if define defaultImmutableMap with "val"
  */
defaultImmutableMap += (5 -> "next language")
defaultImmutableMap.foreach(ele => println(ele._1 + ": " + ele._2))

var mutableMap = mutable.Map[String, Int]()
// ("hello" -> 1) means return tuple with (string).->(parameters_list)
mutableMap += ("hello" -> 1)
mutableMap += ("world" -> 2)
mutableMap += ("next go on" -> 3)
mutableMap.foreach(ele => println(ele._1 + ": " + ele._2))
