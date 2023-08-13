class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i = 340;
        while(i<340){
            System.out.println("I am a Thread");
        }
    }
}

public class Unit_13ConstructorfromThreadclass {
    public static void main(String[] args) {

        MyThr t1 = new MyThr("Ravi");
        MyThr t2 = new MyThr("I Love");
        t1.start();
        t2.start();
        System.out.println("The id of the Thread t is : "+ t1.getId());
        System.out.println("The name o the Thread t is : "+t1.getName());
        System.out.println("The id of the Thread t is : "+ t2.getId());
        System.out.println("The name o the Thread t is : "+t2.getName());

    }
}
