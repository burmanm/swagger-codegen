import com.wordnik.swagger.codegen.BasicGenerator

import com.wordnik.swagger.core._

object WordnikApiRubyCodegen extends RubyCodegen {
  def main(args: Array[String]) = generateClient(args)
  
  override def packageName = "lib"

  // where to write generated code
  override def destinationDir = "samples/wordnik-api-ruby"

  // package for models
  override def modelPackage = Some("models")
}