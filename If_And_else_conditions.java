import java.util.Scanner ;
public class If_And_else_conditions
{
    public static void main(String[] args)
    {
         int age ;
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
         if(age>56)
         {
             System.out.println("You are experienced");
         }
         else if(age>46)
         {
             System.out.println("You are semi experienced");
         }
         else if(age>36)
         {
             System.out.println("You are Semi-Semi-experienced");
         }
         else
         {
             System.out.println(":You are not experienced");
         }
    }
}
