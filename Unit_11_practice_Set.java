abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPain extends Pen{
    void write(){
        System.out.println("write");
    }
    void refill(){
        System.out.println("refill");
    }
    void changeNib(){
        System.out.println("Changing the nib");
    }
}
class Monkey{
    void jump(){
        System.out.println("jumping...");
    }
    void bite(){
        System.out.println("biting...");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{

    void speak(){
        System.out.println("hello sir");
    }
    public void eat(){
        System.out.println("Eating");
    }
    public void sleep(){
        System.out.println("Sleeping");
    }
}
interface TvRemote{
    void switchOn();
    void changingChannel();
}
interface SmartTvRemote extends TvRemote{
    void watchYoutube();
}
class Tv implements TvRemote,SmartTvRemote {
    void displayOff(){
        System.out.println("Displaying off");
    }
     public void switchOn(){
        System.out.println("switchOn....");
    }
    public void changingChannel(){
        System.out.println("Changing channel....");
    }
    public void watchYoutube(){
        System.out.println("watching youtube");
    }
}
abstract class Telephone{
     abstract void ring();
    abstract void lift();
    abstract void disconnect() ;
    }
class SmartTelephone extends Telephone{
    void ring(){
        System.out.println("ringing......");
    }
    void lift(){
        System.out.println("lifting .........");
    }
    void disconnect(){
        System.out.println("Disconnected.....");
    }
    void camera4k(){
        System.out.println("Recording Ultra HD Video");
    }
    void VoiceCall(){
        System.out.println("Calling automatic");
    }
}
public class Unit_11_practice_Set {
    public static void main(String[] args) {

        // problem -- 1 -- 2
/*        FountainPain fp = new FountainPain();
        fp.changeNib();
        fp.write();
        fp.refill();     */

        // problem -- 3
/*        Human ravi = new Human();
        ravi.sleep();
        ravi.eat();
        ravi.bite();
        ravi.jump();
        ravi.speak();       */

        // problem -- 5

        Monkey m1 = new Human();
    //    m1.speak(); // can not speak
       BasicAnimal ba = new Human();
       ba.sleep();
       ba.eat();
    //   ba.speak();  // It is not allowed

        //  problem -- 6
    //    TvRemote T = new TvRemote() ;

        // problem -- 7
        TvRemote tr = new Tv();
        tr.changingChannel();
        tr.switchOn();
    //    tr.displayOff();  It is not allowed

        // problem -- 4

        Telephone t = new SmartTelephone();
        t.ring();
        t.lift();
        t.disconnect();
        SmartTelephone st = new SmartTelephone();
        st.camera4k();
        st.VoiceCall();
        st.ring();
        st.lift();
        st.disconnect();

        }
    }
