import scala.language.experimental.macros
import scala.reflect.macros.blackbox

object Macros_1 {
  def myMacro(): Int = macro myMacroImpl
  def myMacroImpl(c: blackbox.Context)(): c.Tree = {
    import c.universe._
        q"""{
      val ret = 0
      println(ret)
      0
    }"""
  }
}
