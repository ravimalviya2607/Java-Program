class Base{          // Access modifier default
    public int x;

    public int getX(){
        return x;
    }
    public void setX(int x){
        System.out.println("I am in base setting x now");
        this.x = x;
    }
    public void printMe(){
        System.out.println("I am a constructor");
    }
}
class Derived extends Base{         // In this derived class all the part of important element avalable with the help of inheritance
     public int y;

     public int getY(){
         return y;
     }
     public void setY(int y){
         this.y = y;
     }

}
public class Unit_10_Inheritance {
    public static void main(String[] args) {

        // With the help of derived class we can access all the data from the base class
        // Creating an object of base class
        Base b = new Base();
        b.setX(4);
        System.out.println( b.getX());
        // Creating an object of derived class
        Derived d = new Derived();
        d.setX(5);
        System.out.println(d.getX());
        d.setY(12);
        System.out.println(d.getY());
    }
}
