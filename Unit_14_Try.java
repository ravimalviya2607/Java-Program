public class Unit_14_Try {
        public static void main(String[] args) {

                int a = 740;
                int b = 55;

                // Without Try
               // int c = a/b;

                // With try :
                try{
                        int c = a/b;
                        System.out.println(c);
                }catch (Exception e){
                        System.out.println("We failed to divide. Reason :");
                        System.out.println(e);
                }
                System.out.println("End of the program");
        }
}
