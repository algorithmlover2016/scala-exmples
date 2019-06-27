yum install nmap-ncat.x86_64
yum install lrzsz
nc -lk 9999
spark-submit --master yarn --class org.apache.spark.es.streaming.SqlNetworkWordCount uber-spark-examples_2.12-1.0.0-snapshot.jar localhost 9999

# test stream_SqlNetworkWordCount
tailf  error | ncat -lk 9998
spark-submit --master yarn-client --class org.apache.spark.examples.streaming.SqlNetworkWordCount ./uber-spark-examples_2.12-1.0.0-snapshot.jar localhost 9998 >log 2>error &

# test sql_SparkSQLExample
# su hdfs; hdfs  dfs  -mkdir -p examples/src/main/resources/
# hdfs  dfs  -copyFromLocal /opt/bmr/spark2/examples/src/main/resources/*  examples/src/main/resources/
spark-submit --master yarn-client --class org.apache.spark.examples.sql.SparkSQLExample ./uber-spark-examples_2.12-1.0.0-snapshot.jar >log 2>error &
