import java.util.Scanner;
public class Unit_14_Handling_Specific_Exception {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[1] = 6;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind = sc.nextInt();

        System.out.println("Enter the number you want to divide the value with ");
        int number = sc.nextInt();
        try {
            System.out.println("The value at index entered is :" + marks[ind]);
            System.out.println("The value of array-value/number is:" + marks[ind] / number);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Some exception occured !");
            System.out.println(e);
        }
        }
    }
