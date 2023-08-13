import java.util.Scanner;

public class JavaPracticeSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int result = x + y;
        System.out.println("Result = " + result);
        int a = sc.nextInt();
        int j ;
        for(int i=1; i<=10; i++){
            j = 1;
            System.out.println( a + "x" + i + "="  + a*i);
        }
    }
}
