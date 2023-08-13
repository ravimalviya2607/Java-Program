// In This program calculate percentage with the user input

import java.util.Scanner ;
public class UserInput {
    public static void main(String[] args) {
        float eng , phy ,chem , math ,comp ;
        double total , percentage ;
        Scanner op = new Scanner(System.in);
        System.out.println("Enter the 5 subject");
        System.out.println("Enter marks of English subject:");
        eng = op.nextFloat() ;
        System.out.println("Enter marks of physics subject");
        phy = op.nextFloat() ;
        System.out.println("Enter marks of chemistry subject");
        chem = op.nextFloat();
        System.out.println("Enter marks of maths subject");
        math = op.nextFloat();
        System.out.println("Enter marks of computer");
        comp = op.nextFloat();

        /* calculate total and percentage */
        total = eng + phy + chem + math + comp ;
        percentage = ( total / 500 ) * 100 ;
        System.out.println("Total marks =" +total);
        System.out.println("Percentage =" +percentage);


    }
}

