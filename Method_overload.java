import java.util.*;
public class Method_overload {
/*    static void telljokes(){
        System.out.println("I invented a new word!\n" +
                "Plagiarism!");
    }
    int sum( int a, int b){
     return a+b;
    }
    static void change(int a){
         a =100;
    }
    static void change2(int marks[]){
        marks[3]  = 99;
    }    */
    static void foo(){
        System.out.println("Good morning bro");
    }
    static void foo(int a){
        System.out.println("Good morning " + a + " bro");
    }
    static void foo(int a, int b){
        System.out.println("Good morning " + a + " bro");
        System.out.println("Good morning " + b + " bro");
    }
    public static void main(String[] args) {
    /*    Method_overload obj = new Method_overload();
         int x = obj.sum(1,2);
        telljokes();
        System.out.println("\n" +x);   */

    //    case 1: changing the Integer
    //    int x = 45;
    //    change(x);
    //    System.out.println("The value of x after running change is  " +x);

    //  case 2: changing The array
    // int marks[] = {10, 20, 30, 40, 50, 60};
    // change2(marks);
    // System.out.println("The value of x after running change is  " +marks[3]);

        // Method overloading
        foo();
        foo(47);
        foo(100,200); // Argument are actual
    }
}
