import java.util.*;
 public class Operation_on_Array {
     public static void main(String[] args) {

 /*       int marks[] = {5,6,7,8,9,4,2};
         String [] student = {"Ravi","sonu","chiku"};
         System.out.println("Length of Array = " + marks.length);
         System.out.println(marks[0]);
         System.out.println("Length of Array = " + student.length);
         System.out.println(student[2]);   */

         // How to access all Elements in array

         int student[] = {5, 6, 9, 7, 10, 78};
         int i = 0;
         // Simple way

/*         System.out.println(student[0]);
         System.out.println(student[1]);
         System.out.println(student[2]);
         System.out.println(student[3]);
         System.out.println(student[4]);
         System.out.println(student[5]);  */

         System.out.println("Printing using for loops");
         for (i = 0; i < student.length; i++) {
             System.out.println(student[i]);
         }

         // Array Elements access in reverse order
         System.out.println("Array Elements access in reverse order");
         for (i = student.length - 1; i >= 0; i--)
         {
             System.out.println(student[i]);
         }

         // Quick quiz: Displaying the Array(for-each loop)
         System.out.println("Printing using for each loop");
         for(int element:student)
         {
             System.out.println(element);
         }
     }
 }

