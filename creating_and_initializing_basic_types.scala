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
