# test spark-streaming-local
rm -rf /root/test_bmr_spark/output; ${SPARK_HOME}/bin/spark-submit --class WordCount uber-spark_word_count_normal-1.0.0-snapshot.jar file:///root/test_bmr_spark/README file:///root/test_bmr_spark/output

# test spark-streaming-yarn
hdfs dfs -rmr bos://bmrtest-bj/4c0c80c8-5550-439e-7bce-9c72fe6fdde9/daemons/output.spark; spark-submit --master yarn-cluster --class WordCountYarn uber-spark_word_count_normal-1.0.0-snapshot.jar bos://bmrtest-bj/4c0c80c8-5550-439e-7bce-9c72fe6fdde9/daemons/79e0aabc-818f-4fbf-b487-216851276912/  bos://bmrtest-bj/4c0c80c8-5550-439e-7bce-9c72fe6fdde9/daemons/output.spark

#test spark-streaming-yarn with no dependency
hdfs dfs -rmr bos://bmrtest-bj/4c0c80c8-5550-439e-7bce-9c72fe6fdde9/daemons/output.spark; spark-submit --master yarn-cluster --class WordCountYarn spark_word_count_normal-1.0.0-snapshot-WordCountYarn-Yarn.jar  bos://bmrtest-bj/4c0c80c8-5550-439e-7bce-9c72fe6fdde9/daemons/79e0aabc-818f-4fbf-b487-216851276912/  bos://bmrtest-bj/4c0c80c8-5550-439e-7bce-9c72fe6fdde9/daemons/output.spark
