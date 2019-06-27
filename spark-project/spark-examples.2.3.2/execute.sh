yum install nmap-ncat.x86_64
nc -lk 9999
spark-submit --master yarn --class org.apache.spark.es.streaming.SqlNetworkWordCount uber-spark-examples_2.12-1.0.0-snapshot.jar localhost 9999
