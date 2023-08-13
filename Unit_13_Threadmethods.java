class NewMyThr extends Thread {
    public void run() {
        int i = 0;
        while (true) {
            System.out.println("Thank you 1");
            try{
                Thread.sleep(455);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            i++;
        }
    }
}
 class NewMyThr2 extends Thread {
    public void run() {
        while (true) {
            System.out.println("My Thank you 2");
            }
        }
    }
    public class Unit_13_Threadmethods {
        public static void main(String[] args) {

            NewMyThr t1 = new NewMyThr();
            NewMyThr2 t2 = new NewMyThr2();
            t1.start();
/*            try{        // with the help of the method we can solve Exception
                t1.join();
            }
            catch (Exception e){
                System.out.println(e);
            } */
            t2.start();


    }
}