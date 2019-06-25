package com.selflearning.sparktests

import org.apache.spark.{SparkConf, SparkContext}

object HelloWorld {
  def main(args : Array[String]) : Unit = {
    if (args.length < 1) {
      System.err.println("Usage: HelloWorld inputFileName")
      System.exit(1)
    }
    val conf = new SparkConf().setAppName("HelloWorld").setMaster("local")
    val sc = new SparkContext(conf)

    val data = sc.textFile(args(0))
    data.foreach(println)
  }
}
