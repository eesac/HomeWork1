//package comScalaa
//
//object scalaEj4
//{
//  val source = io.Source.fromFile("C:\\Users\\Consultant\\IdeaProjects\\practice\\venv\\votes_test.json")
//  val data_read = for (lines <- bufferedSource.getLines) yield
//  {
//    Map("Id" -> ujson.read(lines)("Id").str, "PostId" -> ujson.read(lines)("PostId").str, "VoteTypeId" -> ujson.read(lines)("VoteTypeId").str)
//  }
//  data_read.foreach(println)
//
//}
