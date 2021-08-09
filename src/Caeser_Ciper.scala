//19000091
//Assignment Caeser Ciper

object Caeser_Ciper {
  def main(args:Array[String]):Unit = {

    val string = "AnupamaDhananjayaBandara"


    val cipertext = encode_decode(Encode, string, 6, alphabet)
    println("Cipher Encoded Text = " + cipertext);


    val plaintext = encode_decode(Decode, cipertext, 6, alphabet)
    println("Decoded Plain Text = " + plaintext);


    if(string.toUpperCase == plaintext){

      println()
      println("Decoded Plain Text is Equal to Original Text");

    }

    else{

      println()
      println("Decoded Plain Text is Not Equal to Original Text");

    }

  }


  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  val Encode = (c:Char, key:Int, a:String) => a((a.indexOf(c.toUpper) + key) % a.size)

  val convert = (num:Int, a:String) => if(num >= 0) num else a.size + num

  val Decode = (c:Char, key:Int, a:String) => a(convert(((a.indexOf(c.toUpper) - key) % a.size), a))

  val encode_decode = (algorithm:(Char, Int, String) => Char, s:String, key:Int, a:String) => s.map(algorithm(_, key, a))
}
