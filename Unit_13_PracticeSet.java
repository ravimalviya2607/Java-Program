class Gm extends Thread {
    public void run() {
        int i=0;
        while (true) {
            try {
                Thread.sleep(200);
            }catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Good Morning");
            }
        }
    }
class Wc extends Thread{
   public void run(){
       int j=0;
       while(true){
           try {
               Thread.sleep(200);
           }catch (Exception e){
               System.out.println(e);
           }
           System.out.println("Welcome");
       }
   }
}
public class Unit_13_PracticeSet {
    public static void main(String[] args) {

        // problem--1--2
        // object for Thread
        Gm s1 = new Gm();
        Wc s2 = new Wc();
       // Set priority
    //    s1.setPriority(6);
    //    s2.setPriority(9);
          System.out.println(s1.getState());
          System.out.println(s2.getState());
    //    System.out.println(s1.getPriority());
    //    System.out.println(s2.getPriority());

        // Execute the Thread
        s1.start();
        s2.start();

     //  problem -- 5
        System.out.println(Thread.currentThread().getState());
    }
}
