import java.util.Scanner ;
public class Switch_Case_Statements
{
    public static void main(String[] args)
    {
        int age ;
        System.out.println("Enter your Age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        switch (age) {
            case 18:
                System.out.println("You can drive a bike");
                break;
            case 21:
                System.out.println("you are a young");
                break;
            case 35:
                System.out.println("You are a man");
                break;
            case 60:
                System.out.println("you are old");
                break;
            default:
                System.out.println("............");
                break;
        }

    }
}
