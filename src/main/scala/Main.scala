import org.apache.spark._

object Main {
  def main(args: Array[String]) {
    val appName = ???
    val master = ???
    val sparkConf = new SparkConf().setAppName(appName).setMaster(master)
    val sc = new SparkContext(sparkConf)

    ???

    sc.stop()
  }
}
