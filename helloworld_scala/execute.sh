scala -classpath target/helloworld_scala-1.0-SNAPSHOT-jar-with-dependencies.jar  com.selflearning.mytest.App
scala -classpath  target/helloworld_scala-1.0-SNAPSHOT.jar  com.selflearning.mytest.App

java -cp $(dirname $(which scala))/../lib/scala-library.jar -jar target/helloworld_scala-1.0-SNAPSHOT-jar-with-dependencies.jar com.selflearning.mytest.App
java -jar target/helloworld_scala-1.0-SNAPSHOT-jar-with-dependencies.jar

java -cp $(dirname $(which scala))/../lib/scala-library.jar:target/helloworld_scala-1.0-SNAPSHOT-jar-with-dependencies.jar com.selflearning.mytest.App
java -cp  target/helloworld_scala-1.0-SNAPSHOT-jar-with-dependencies.jar com.selflearning.mytest.App

java -cp $(dirname $(which scala))/../lib/scala-library.jar:target/helloworld_scala-1.0-SNAPSHOT.jar com.selflearning.mytest.App
