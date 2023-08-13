import java.util.*;
public class Unit_6_practice_set {
    public static void main(String[] args) {

        // practice problem  1

 /*        float marks[] = {45.2f, 26.8f, 55.6f, 14.7f,41.3f};
        float sum = 0;
        for(int i=0;i<5;i++)
        {
            sum = sum + marks[i];
        }
        System.out.println(sum);

         for(float element:marks)
        {
            sum = sum + element;
        }
        System.out.println("The value of sum is == " +sum);

        // practice problem  2

      int marks[] = {10, 20, 30, 40, 50, 60};
        int num = 50; int i =0;
        boolean isInArray = false;

        for(int element:marks)
        {
            if(num == element)
            {
                isInArray = true;
                break;
            }
        }
        if(isInArray)
        {
            System.out.println("The value is present in the array");
        }
        else
        {
            System.out.println("The value is not present in the array");
        }

        // practice problem 3

        float marks[] = {45.2f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;

        for(float element:marks)
        {
            sum = sum + element;

        }
        System.out.println("sum of marks is :: " +sum);
        System.out.println("The value of average marks is == " + sum/marks.length]);

        // practice problem 4

        //col1,col2,col3
        int mat1[][] = {{1, 2, 3}, // row1
                        {4, 5, 6}};//row2

        //col1,col2,col3
        int mat2[][] = {{8, 4, 7}, // row1
                        {9, 1, 0}};//row2

       //col1,col2,col3
       int result[][] = {{8, 4, 7}, // row1
                {9, 1, 0}};//row2

        for (int i = 0; i < mat1.length; i++) { //row number of time

            for (int j = 0; j < mat1[i].length; j++) { // column number of the

                result[i][j] = mat1[i][j] + mat2[i][j];

            }
        }
        // printing the element of a 2-D Array
        for (int i = 0; i < mat1.length; i++) { //row number of time

            for (int j = 0; j < mat1[i].length; j++) { // column number of the
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println("");
            }    */

        // problem no - 5

        int student[] = {5, 4, 3, 2, 1};
        int l = student.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for (int i = 0; i < n; i++) {
            // Swap a[i] and a[l-1-i]
            // a  b temp
            temp = student[i];
            student[i] = student[l - 1 - i];
            student[l - 1 - i] = temp;

        }
        // Printing the Reverse Array

         for(int element:student)
         {
             System.out.print(element +" ");
         }

         // practice problem - 4


    }
}