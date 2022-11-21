//package comScalaa
//import scala.language.postfixOps
//object scalaEj3
//{
//    var end_resu = Map[String, Int]()
//    def main(args: Array[String])
//    {
//      val srce = io.Source.fromFile("C:\\Users\\Consultant\\Downloads\\votes_test.json")
//      for (sentence <- srce.getLines.mkString.split(" "))
//      {
//        if (end_resu.contains(sentence) == false)
//        {
//          end_resu = end_resu ++ Map(sentence -> 0)
//        }
//        end_resu = end_resu ++ Map(sentence -> (end_resu.get(sentence).getOrElse(0) + 1))
//      }
//      println(end_resu)
//    }
//
//}
