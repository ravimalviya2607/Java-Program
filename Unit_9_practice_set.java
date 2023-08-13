class Cylinder{
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceAera(){
        return 2*Math.PI*radius*(radius+height);
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}
class Ractanglee{
    private int length;
    private int breadth;

    public int getLength() {
        return length;
    }
    public int getBreadth() {
        return breadth;
    }

    public Ractanglee(){
        this.length = 4;
        this.breadth = 5;
    }
    public Ractanglee(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
}
public class Unit_9_practice_set {
    public Unit_9_practice_set() {
    }

    public static void main(String[] args) {
        // problem -- 1

/*       Cylinder myCylinder = new Cylinder();
       Cylinder myCylinder = new Cylinder(10,5);
       myCylinder.setHeight(5);
        System.out.println(myCylinder.getHeight());
        myCylinder.setRadius(10);
        System.out.println(myCylinder.getRadius());
       // problem -- 2
        System.out.println("Toal Surface of cylinder : " +myCylinder.surfaceAera());
        System.out.println("Volume of cylinder : " +myCylinder.volume());
*/

        // problem -- 3

    //    Ractanglee  rt = new Ractanglee();
        Ractanglee rt = new Ractanglee(4,5);
        System.out.println(rt.getLength());
        System.out.println(rt.getBreadth());
        
    }
}
