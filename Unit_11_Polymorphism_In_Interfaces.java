
interface MyCamera2{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4kVideo(){
        greet();
        System.out.println("Recording in 4k");
    }
}
interface MyWifi2{
    String [] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("calling" +phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone2 extends MyCellPhone2 implements MyWifi2, MyCamera2{
    public void takeSnap(){
        System.out.println("Taking Snap");
    }
    public void recordVideo(){
        System.out.println("Taking recording...");
    }
    //    public void record4kVideo(){
//        System.out.println("recording in 4k");
//    }
    public String [] getNetworks(){
        System.out.println("Getting List of Networks");
        String [] networkList  = {"Ravi", "Sonu", "Benq"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " +network);
    }
}
public class Unit_11_Polymorphism_In_Interfaces {
    public static void main(String[] args) {

        MyCamera2 cam1 = new MySmartPhone2();
        // not allowed
        //cam.getNetwork();
        cam1.record4kVideo();
        MySmartPhone2 s = new MySmartPhone2();
        s.recordVideo();
        s.getNetworks();
        s.callNumber(635009370);
        s.pickCall();
        String[] ar = s.getNetworks();
        for (String item : ar) {
            System.out.println(item);

        }
    }
}