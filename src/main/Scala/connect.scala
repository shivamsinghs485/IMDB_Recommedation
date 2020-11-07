import org.apache.spark.sql.types.StructType
import org.apache.spark.sql.{DataFrame, SparkSession}

class connect {
	val spark=SparkSession.builder().appName("actions").config("spark.master" , "local[*]").getOrCreate()
	def read(format : String , path : String) : DataFrame=
	return spark.read.format(format).load(path)
	def read(format : String , path : String,schema : StructType) : DataFrame=
		return spark.read.format(format).schema(schema).load(path)
	
	def write(): Unit =
	{
	
	}
}
