class Base1{
    Base1(){
        System.out.println("I am a base class constructor");
    }
    Base1(int x){
        System.out.println("I am a base class overloaded constructor with valur of x: " + x);
    }
}
class Derived1 extends Base1{
    Derived1(){
    //    super(0);  // we want to run argument of constructor then we use super key word
        System.out.println("I am a derived class constructor");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am a derived class overloaded constructor with valur of y: " + y);
    }
}
class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I am a child of derived constructor");
    }
    ChildOfDerived(int x, int y, int z){
        super(x, y);
        System.out.println("I am a derived class overloaded constructor with valur of z :" + z);
    }
}
public class Unit_10_constructors_in_inheritance {
    public static void main(String[] args) {

    //    Base1 b = new Base1();
    //    Derived1 d = new Derived1();
    //    Derived1 d = new Derived1(4,9);
        ChildOfDerived cd = new ChildOfDerived(12, 13,15);
    }
}
