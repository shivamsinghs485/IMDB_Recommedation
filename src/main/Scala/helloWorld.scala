import org.apache.spark.sql.SparkSession

object helloWorld extends App {
val session=new connect()
	val spark= session.spark
	spark.sparkContext.setLogLevel("WARN")
	session.read("CSV","src/main/resources/input/name.basics.tsv/data.tsv").show()
}
