import java.util.* ;
public class for_loops {
    public static void main(String[] args) {
/*        int i;
        for (i = 0; i <= 100; i++)
        {
            System.out.println(i);
        }
*/
        //  Quick Quiz :  write a program to print first n odd
        //  number using a for loop
        Scanner sc = new Scanner(System.in);
        int i, n;
        n = sc.nextInt();
//        for (i = 1; i <= n; i++) {
//         for a odd number

//          System.out.println(2*i-1);
//        }

//           For a Even number

//        System.out.println(2*i);

        // Decrementing loop
        for (i = n; i >= 0; i--) {
            System.out.println(i);
     }

    }
}