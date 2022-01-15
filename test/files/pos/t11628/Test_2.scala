object MacroUsage {
  def a(default: Int = 0, defaultOrNonDefault: Int)(args: Int*) = ???
  def b(num: => Int): Int = ???
  a(defaultOrNonDefault = 0)(b(Macros_1.myMacro()))
}
