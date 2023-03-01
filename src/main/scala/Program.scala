import machines.regex._
import machines.given

@main
def main() = {

  //////////////////////////////////////////////////////////////////////////////
  // Part 1
  //////////////////////////////////////////////////////////////////////////////
  //
  // TODO: Make it possible to replace the definitions with:
  //
  //     val zero = '0'
  //     val one  = '1'
  //     etc.
  //

  val zero = '0'
  val one = '1'
  val two = '2'
  val three = '3'
  val four = '4'
  val five = '5'
  val six = '6'
  val seven = '7'
  val eight = '8'
  val nine = '9'

  require(zero matches "0")
  require(one matches "1")
  require(two matches "2")
  require(three matches "3")
  require(four matches "4")
  require(five matches "5")
  require(six matches "6")
  require(seven matches "7")
  require(eight matches "8")
  require(nine matches "9")

  //////////////////////////////////////////////////////////////////////////////
  // Part 2
  //////////////////////////////////////////////////////////////////////////////
  //
  // TODO: Make it possible to replace the definition with:
  //
  //     val answer = "42"
  //

  val answer = "42"

  require(answer matches "42")
  
}