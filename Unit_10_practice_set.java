class Circle1{
    public int radius;
    Circle1(int r){
        System.out.println("I am  circle perameterized constructor");
        this.radius = r;
    }
     public double area(){
         return Math.PI*this.radius*this.radius;
     }
}
class Cylinder1 extends Circle1{
    public int height;
    Cylinder1(int r, int h){
        super(r);
    System.out.println("I am cylinder1 parameterized constructors");
        this.height = h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
class Ractangle2{
    public int length;
    public int breadth;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    /*    Ractangle2(int l, int b){
            System.out.println("I am Ractangle2 class of constructor");
            this.length = l;
            this.breadth = b;
        }          */
    public int area(){
        return this.length*this.breadth;
    }
    public int Rperimeter(){
        return 2*(length+breadth);
    }
}
class Cuboid extends Ractangle2 {
    public int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    /*    Cuboid(int l, int b, int h){
            super(l, b);
            System.out.println("I am cuboid class constructor");
            this.height = h;
        }     */
    public int surfaceArea(){
        return 2*(length*breadth+breadth*height+height*length);
    }
    public int perimeter(){
        return 4*(length+breadth+height);
    }
}
class Base2 {
    Base2() {
        System.out.println("I am Base2 class constructor");
    }
}
class Derived2 extends Base2 {
    Derived2() {
        System.out.println("I am Derived2 class constructor");
    }
}
class Derived3 extends Derived2{
    Derived3(){
        System.out.println("I am Derived3 class constructor");
    }
}
public class Unit_10_practice_set {
    public static void main(String[] args) {

        // Problem 1
//     Circle1 obj = new Circle1(10);
//     Cylinder1 obj = new Cylinder1(10,20);
//        System.out.println("area of circle : " +obj.area());
//        System.out.println("volume of Cylinder : " +obj.volume());

        // problem 2

/*        Cuboid obj = new Cuboid(5,6,7);
        System.out.println("area of Ractangle is : "+obj.area());
        Ractangle2 obj2 = new Ractangle2(5,6);
        System.out.println("perimeter of Ractangle is : "+obj2.perimeter());
        System.out.println("Surface area is : "+obj.surfaceArea());
        System.out.println("Perimeter of Cuboid is : "+obj.perimeter());
*/
        // problem 3 - 4

/*        Cuboid obj = new Cuboid();
        obj.setHeight(1);
        obj.setBreadth(2);
        obj.setLength(3);
        System.out.println(obj.getHeight());
        System.out.println(obj.getBreadth());
        System.out.println(obj.getLength());
        System.out.println("Aera of Ractangle is : "+obj.area());
        System.out.println("Perimeter of Ractangle is : "+obj.Rperimeter());
        System.out.println("Surface area of Cuboid is : "+obj.surfaceArea());
        System.out.println("Perimeter of Cuboid is : "+obj.perimeter());
*/
        // problem -- 5

        Derived3 d3 = new Derived3();


    }
}
