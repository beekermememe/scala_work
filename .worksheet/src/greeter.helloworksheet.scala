package greeter

object helloworksheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(84); 
  println("Welcome to the Scala worksheet");$skip(38); 
  println("A test for the worksheet");$skip(12); 
  val i = 1;System.out.println("""i  : Int = """ + $show(i ));$skip(16); 
  val x = i + 2;System.out.println("""x  : Int = """ + $show(x ))}
}
