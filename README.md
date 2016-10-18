## What is this?
This is a template project for a Spark application, created for use in a Spark course.

The `Main` object provides a main method which sets up your SparkContext `sc` (provided you set up the appName and master).
After the `SparkContext` is created, you can interact with your cluster via this context. 

It also provides a `SampleTest` class which gives an example of how you can create a test using a `SharedSparkContext` (courtesy of [Holden Karau](https://github.com/holdenk/spark-testing-base))

## How to run
- `sbt assembly`
- `spark-submit target/scala-2.11/spark-template-assembly-1.0.jar`
