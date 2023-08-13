public class FinallyBlock {
    public static int greet() {
        try {
            int a = 50;
            int b  = 10;
            int c = a/b;
            return c;
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("this is the end of this program");
        }
        return -1;
    }

    public static void main(String[] args) {
        int l = greet();
        System.out.println(l);
        int a = 7;
        int b = 9;
        while(true){
            try{
                System.out.println(a/b);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("I am finally for value of b = " +b);
            }
            b--;
        }
        try{
            System.out.println(50/10);
        }
        finally {
            System.out.println("Yes this is finally");
        }
    }
}