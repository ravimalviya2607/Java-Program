// This is the Rock, Paper And Scissor
import java.util.*;
public class Game
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Start Game");
        System.out.println("0 is for rock");
        System.out.println("1 is for paper");
        System.out.println("2 is for scissor");
        System.out.println("---------------------------------------------");

        int computer_choice;
        int computerwon = 0;
        int my_choice;
        int me = 0;
        int game = 1 ;

        while(game<=5)
        {
            Random rand = new Random();
            computer_choice = rand.nextInt(2);
            my_choice = sc.nextInt();
            switch(my_choice)
            {
                case 0:
                    System.out.println("your choice is rock");
                    break;
                case 1:
                    System.out.println("your choice is paper");
                    break;
                case 2:
                    System.out.println("your choice is scissors");
                    break;
                default:
                    System.out.println("invalid choice");
            }
            switch(computer_choice)
                {
                    case 0:
                        System.out.println("computer choice is rock");
                        break;
                    case 1:
                        System.out.println("computer choice is paper");
                        break;
                    case 2:
                        System.out.println("computer choice is scissors");
                        break;
                }

            if(computer_choice==my_choice)
            {
                System.out.println("match is tie");
            }
            else if(computer_choice==0 && my_choice==1)
            {
                System.out.println("i won !!! and computer lose");
                me++;
            }
            else if(computer_choice==0 && my_choice==2)
            {
                System.out.println("computer won");
                computerwon++;
            }
            else if(computer_choice==1 && my_choice==0)
            {
                System.out.println("computer won");
                computerwon++;
            }
            else if(computer_choice==1 && my_choice==2)
            {
                System.out.println("i won !!! and computer lose");
                me++;
            }
            else if(computer_choice==2 && my_choice==0)
            {
                System.out.println("i won !!! and computer lose");
                me++;
            }
            else if(computer_choice==2 && my_choice==1)
            {
                System.out.println("computer won");
                computerwon++;
            }
            if(game==5)
            {
                break;
            }
            game++;
        }
        System.out.println("-----------------------------------------");

        System.out.println("computer"+" : "+computerwon);
        System.out.println("me"+" : "+me);

        System.out.println("-----------------------------------------");

        if(computerwon>me)
        {
            System.out.println("computer won the game");
        }
        else if(computerwon==me)
        {
            System.out.println("match is tie");
        }
        else
        {
            System.out.println("i won the game and more practice to computer");
        }
    }
}
