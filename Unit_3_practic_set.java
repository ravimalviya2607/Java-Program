/*
     Unit_3_practie_set for java programming
 */
public class Unit_3_practic_set
{
public static void main(String[] arg)

{
     // Question no.1

 String Rv = "RVhacker" ;
 Rv = Rv.toLowerCase();
 System.out.println(Rv);

     // Question no.2

 String king = "Rv  Hacker joy" ;
 king = king.replace(" ","_");
 System.out.println(king);

     // Question no.3

 String Letter = " Dear <|name|> Thanks a lot " ;
 Letter = Letter.replace("<|name|>","Ravi");
 System.out.println(Letter);

    // Question no.4

 String myString = "This string contains double  and triple spaces";
 System.out.println(myString.indexOf("  "));
 System.out.println(myString.indexOf("   "));

   // Question no.5

String Letter2 ="Dear Harry,\n\tThis Java Course is Nice.\n\t Thanks!" ;
System.out.println(Letter2);

 }

}
