${SPARK_HOME}/bin/spark-submit --class com.selflearning.sparktests.HelloWorld uber-spark_hello_world-1.0.0-snapshot.jar file://$(readlink -f README)
