import java.util.*;
public class Calculate_Any_factorial
{
    public static void main(String[] args)
    {
        Scanner Input = new Scanner(System.in);
        int i =1;
        int factorial = 1;
        int n = Input.nextInt();
        for(i=1 ; i<=n;i++)
        {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
