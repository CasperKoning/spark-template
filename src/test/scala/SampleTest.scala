import org.scalatest._
import com.holdenkarau.spark.testing._
import org.scalatest.funsuite.AnyFunSuite

class SampleTest extends AnyFunSuite with SharedSparkContext {
  test("test initializing spark context") {
    val list = List(1, 2, 3, 4)
    val rdd = sc.parallelize(list)

    assert(rdd.count === list.length)
  }
}
