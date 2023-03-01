package machines

import regex._
import dfa._

// TODO: Add your code below

given Conversion[Char, RegularLanguage] = n => Character(n)


given Conversion[String, RegularLanguage] = s => {
  def convert(charLs: List[Char]): RegularLanguage = charLs match {
    case Nil => Epsilon
    case head :: tail => Concat(Character(head), convert(tail))
  }
  convert(s.toList)
}


extension (rl1: RegularLanguage)
    def ||(rl2: RegularLanguage) = Union(rl1, rl2)
    def ~(rl2: RegularLanguage) = Concat(rl1, rl2)
    def <*> = Star(rl1)
    def <+> = Concat(rl1, Star(rl1))
    def apply(n: Int): RegularLanguage =
        if n == 0 then Epsilon
        else Concat(rl1, rl1(n - 1))
    


