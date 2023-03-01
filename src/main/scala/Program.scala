import machines.regex._
import machines.{_, given}

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

  //////////////////////////////////////////////////////////////////////////////
  // Part 3a
  //////////////////////////////////////////////////////////////////////////////

  val digit = '0' || '1' || '2' || '3' || '4' || '5' || '6' || '7' || '8' || '9'

  require(digit matches "0")
  require(digit matches "1")
  require(digit matches "2")
  require(digit matches "3")
  require(digit matches "4")
  require(digit matches "5")
  require(digit matches "6")
  require(digit matches "7")
  require(digit matches "8")
  require(digit matches "9")

  //////////////////////////////////////////////////////////////////////////////
  // Part 3b
  //////////////////////////////////////////////////////////////////////////////

  val pi = '3' ~ '1' ~ '4'

  require(pi matches "314")

  //////////////////////////////////////////////////////////////////////////////
  // Part 3c
  //////////////////////////////////////////////////////////////////////////////

  val zeroOrMoreDigits = digit <*>

  require(zeroOrMoreDigits matches "")
  require(zeroOrMoreDigits matches "0")
  require(zeroOrMoreDigits matches "9")
  require(zeroOrMoreDigits matches "09")
  require(zeroOrMoreDigits matches "987651234")

  //////////////////////////////////////////////////////////////////////////////
  // Part 3d
  //////////////////////////////////////////////////////////////////////////////

  val number = digit <+>

  require(!(number matches ""))
  require(number matches "0")
  require(number matches "9")
  require(number matches "09")
  require(number matches "987651234")

  //////////////////////////////////////////////////////////////////////////////
  // Part 3e
  //////////////////////////////////////////////////////////////////////////////

  val cThree = 'c' { 3 }

  require(cThree matches "ccc")
  
}