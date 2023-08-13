import java.util.Random;
import java.util.Scanner;

public class Loops_control {
    public static void main(String[] args) {
/*        int i = 1;
        while (i <= 4) {

            System.out.println(i);
            i++;
        }

        while (true) {
            System.out.println("infinite loops");//
        }
*/
        // Write a program to print natural numbers from 100 to 20

/*        int i = 1;
        while (i <= 4) {

            System.out.println(i);
            i++;
       }

        int b = 10 ;
        do
        {
            System.out.println(b);
            b++;
        } while(b<5);
    */

        //  write a program to print first n natural number using do - while loop //

        int n ,i=1;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        do {
            System.out.println(i);
            i++;
        } while (i<=n);

    }

}
