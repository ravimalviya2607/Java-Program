class Phone{
    public void showTime(){
        System.out.println("Time is 8 am");
    }
    public void On(){
        System.out.println("Turning on Phone...");
    }
}
class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music...");
    }
    public void On(){
        System.out.println("Turning on SmartPhone...");
    }
}
public class Unit_10_DynamicMethodDispatch {
    public static void main(String[] args) {
    //    Phone obj = new Phone();   // Allowed
    //    SmartPhone smobj = new SmartPhone();  // Allowed
    //    obj.name();
    //    obj.greet();

        Phone obj = new SmartPhone();
        // SmartPhone obj2 = new Phone(); // Not allowed
        obj.showTime();
        obj.On();
    //    obj.music();   Not allowed
    }
}
