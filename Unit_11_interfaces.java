interface Bicycle{
    // In interfaces present all the value are the final value
    int a = 45;
    void applyBreak(int decrement);
    void speedup(int increment);
}
interface HornBicycle{
    void blowHornk3g();
    void blowHornmhn();
}
class AvonCycle implements Bicycle, HornBicycle{
    void blowHorn(){
        System.out.println("pee pee poo poo");
    }
    public void applyBreak(int decrement){
        System.out.println("Applying break");
    }
    public void speedup(int increment){
        System.out.println("Applying SpeedUP");
    }
    public void blowHornk3g(){
        System.out.println("************");
    }
    public void blowHornmhn(){
        System.out.println("/////////////");
    }
}
public class Unit_11_interfaces {
    public static void main(String[] args) {

        AvonCycle cycleRavi = new AvonCycle();
        cycleRavi.applyBreak(1);
        cycleRavi.speedup(2);
        // You can create properties in Interfaces
        System.out.println(cycleRavi.a);
        // You cannot modify the properties in Interfaces as they are finalS
        // cycleRavi.a = 45;
        cycleRavi.blowHornk3g();
        cycleRavi.blowHornmhn();
    }
}
