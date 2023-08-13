import java.util.*;
public class problem_statement
{
    public static void main(String[] args) {


    // declaring and initializing 2D array
 /*   int student [][] = {{ 2, 7, 9 }, { 3, 6, 1 }, {7, 4, 2 } };

    // printing 2D array
    for(int i =0; i < 3; i++){
        for(int j = 0; j < 3; j++)
            System.out.print(student[i][j] + " ");

        System.out.println();
        }
*/

        // 2D - Array

                Scanner sc = new Scanner(System.in);
                int row = sc.nextInt();
                int col = sc.nextInt();

                int[][] matrix = new int[row][col];

                // input
                // rows
                for (int i = 0; i < row; i++) {
                    // columns
                    for (int j = 0; j < col; j++) {
                        matrix[i][j] = sc.nextInt();
                    }
                }
                // output
                for (int i = 0; i < row; i++) {
                    // columns
                    for (int j = 0; j < col; j++) {
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println();
                }

            }
        }
