import java.util.Scanner;

public class Unti_14_pratice_set {
    public static void main(String[] args) {
        // problem 1
        // int a = 7
        // Syntax error

        int year_born  = 2000-78; // logical error
    //    System.out.println(6/0);

        // problem - 2
 /*       try{
            int a = 666/9;
        }
        catch (IllegalAccessException e){
            System.out.println("HeHe");
        }
        catch (ArithmeticException e){
            System.out.println("Haha");
        }    */

        // problem - 4

        boolean flag = true;
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;
        while(flag && i<5){
            try {
                System.out.println("Enter the value of index");
                index = sc.nextInt();
                System.out.println("The value of marks[index] is " + marks[index]);
                break;
            }
            catch (Exception e){
                System.out.println("Invalid index");
                i++;
            }
        }
        if(i>5){
            System.out.println("Error");
        }
    }
}
