# Reflection on implementing regular expressions of a DSL

## Which operators were easiest to implement and why?

## Which operators were most difficult to implement and why?

## Comment on the design of this internal DSL

Write a few brief paragraphs that discuss:

- What works about this design? (For example, what things seem easy and
  natural to say, using the DSL?)
- What doesn't work about this design? (For example, what things seem
  cumbersome to say?)
- Think of a syntactic change that might make the language better. How would
  you implement it _or_ what features of Scala would prevent you from
  implementing it? (You don't have to write code for this part. You could say
  "I would use extension to..." or "Scala's rules for valid
  identifiers prevent...")

Char to RL was pretty straightforward. String to RL, I just decided to go with recurssion because 
recursion is something I know pretty well, and it would be easy to mess up reduce+map - something whose syntax I am still finicky about. I implemented an entire helper function within the conversion 
clause - and it is pretty cool that I can do that. The Conversion[Char, RegularLanguage], ||, ~, * and + were good call backs to class where we implemented similar things. String to RegularLanguage was a fun puzzle of sorts. 

I overall like the end design. It the operation calls and implicit conversions help make it feel very natural. 

I have been having a bad time right now, but I did parts 1-3 and part 5 pretty well, and I am proud of that. 