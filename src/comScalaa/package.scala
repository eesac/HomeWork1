package object comScalaa {
  import scala.language.postfixOps
  object test_count {
    var results = Map[String,Int] ()
    def main(args: Array[String]) {
      println("Welcome to scala!!!!!!!!!")
      val fileSource = io.Source.fromFile("C:/Users/Consultant/Downloads/votes_test.json")

      for (line <- fileSource.getLines.mkString.split(" "))
      {
        if (results.contains(line) == false)
        {
          results = results ++ Map(line -> 0)

        }
        results = results ++ Map(line -> (results.get(line).getOrElse(0) +1 ))
      }
      println(results)
    }
  }
}
