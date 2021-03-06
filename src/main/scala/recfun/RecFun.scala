package recfun

object RecFun extends RecFunInterface:

  def main(args: Array[String]): Unit =
    println("Pascal's Triangle")
    for row <- 0 to 10 do
      for col <- 0 to row do
        print(s"${pascal(col, row)} ")
      println()

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = 
    if c == 0 || c == r then 1 else pascal(c - 1, r - 1) + pascal(c, r - 1)

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = ???
  // counter +1 for '(' -1 for ')'
    // def match_parentheses(parenthesis: Char, chars: List[Char]): Boolean =
    //   val opposite = ("()".toList diff List(parenthesis)).head


  /**
   * Exercise 3
   */
  // def countChange(money: Int, coins: List[Int]): Int = ???
