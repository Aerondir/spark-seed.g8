package $package$

import org.apache.spark.sql.SparkSession
import org.apache.log4j.{Logger, Level}

trait SparkSessionTestWrapper {

  lazy val spark: SparkSession = {
    Logger.getLogger("org").setLevel(Level.ERROR)
    SparkSession.builder().master("local").appName("spark session").getOrCreate()
  }

}
