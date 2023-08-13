public class Conditionals_Statement
{
    public static void main(String[] args)
    {
        int age = 15 ;
        if(age>18)
        {
    //        System.out.println("yes boy you can drive");
        }
        else
        {
    //        System.out.println("No boy you cannot drive yet");

            // Logical AND Operator

            boolean a = true;
            boolean b = false ;
            if(a && b)
            {
    //            System.out.println("yes");
            }
            else
            {
    //            System.out.println("No");
            }
            // Logical OR Operator

            boolean A = true;
            boolean B = false ;
            if(a || b)
            {
    //            System.out.println("yes");
            }
            else
            {
    //            System.out.println("No");
            }

            // Logical Not Operator

            System.out.println(!A);
            System.out.println(!B);
        }
    }
}
