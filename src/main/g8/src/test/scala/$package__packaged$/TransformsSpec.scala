package $package$

import org.scalatest.funspec.AnyFunSpec
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types.{StructField, StructType, StringType}
import org.apache.spark.sql.Row

class TransformsSpec
  extends AnyFunSpec
    with SparkSessionTestWrapper {

  import spark.implicits._

  describe(".happyData") {

    it("appends a happy column to a DataFrame") {

      val sourceDF = Seq(
        ("jose"),
        ("li"),
        ("luisa")
      ).toDF("name")

      val actualDF = sourceDF.transform(transforms.happyData())

      val expectedData = List(
        Row("jose", "data is fun"),
        Row("li", "data is fun"),
        Row("luisa", "data is fun")
      )

      val expectedSchema = List(
        StructField("name", StringType, true),
        StructField("happy", StringType, false)
      )

      val expectedDF = spark.createDataFrame(
        spark.sparkContext.parallelize(expectedData),
        StructType(expectedSchema)
      )

      assert(actualDF.collect() === expectedDF.collect())

    }

  }

}
