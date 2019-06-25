nc -lk 9999
rm -rf /root/test_bmr_spark/output.network; ${SPARK_HOME}/bin/spark-submit --master local[2] --class org.apache.spark.examples.streaming.NetworkWordCount uber-spark_word_count_network-1.0.0-snapshot.jar localhost 9999  file:///root/test_bmr_spark/output.network
