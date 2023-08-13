import java.util.*;
public class Unit_7_practice_set {
    /*     static void Mult_Table(int n){
            for(int i=1;i<=10;i++){
                System.out.println(n*i);
            }
        }
         static void pattern1(int n) {
             for (int i = 0; i < n; i++) {
                 for (int j = 0; j < i+1; j++) {
                     System.out.print("*");
                 }
                 System.out.println();
             }
         }
      }
    static int natural_number(int n) {
        if (n == 1) {
            return 1;
        }
        return n + natural_number(n - 1);
    }    */

        static void patttern2(int n){
                for(int i=0;i<n;i++){
                    for (int j=n;j>i;j--){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
/*   static int fib(int n){
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else {
            return fib(n-1) + fib(n-2);
        }
    }         */
    public static void main(String[] args) {

        // Problem -- 1

//        Mult_Table(4);

        // Problem -- 2

        //   pattern1(4);

        // Problem -- 3
/*        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();


        natural_number(a);
        System.out.println(natural_number(a)); */

        // problem --4

         patttern2(4);

        // Problem -- 5
        // Fibonacci series - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

        //int result = fib(5);
        //System.out.println(result);

        // Problem -- 8
    }
}