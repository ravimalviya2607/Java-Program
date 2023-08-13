import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString(){
        return  "I am toString()";
    }
    @Override
    public String getMessage(){
        return "I am getMessage" ;
    }
}
class MaxAgeException extends Exception{
@Override
public String toString(){
        return  "Age cannot be greater than 125";
        }
@Override
public String getMessage(){
        return "Make sure that the value of age is correct";
        }
  }
public class Unit_14_ExceptionClass {
    public static void main(String[] args) {

        int a = 8;
        Scanner sc = new Scanner(System.in);
        a  = sc.nextInt();
        if(a<99){
            try{
                throw new MyException();
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);                e.printStackTrace();
                System.out.println("Finished");

            }

        }

    }
}
