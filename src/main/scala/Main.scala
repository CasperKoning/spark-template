import org.apache.spark._
import org.apache.spark.sql.SparkSession

object Main {
  def main(args: Array[String]): Unit = {
    val appName = ???
    val master = ???
    val sparkConf = new SparkConf()
    
    val sparkSession = SparkSession.builder()
      .appName(appName)
      .master(master)
      .getOrCreate()

    import sparkSession.implicits._

    ???

    sparkSession.stop()
  }
}
