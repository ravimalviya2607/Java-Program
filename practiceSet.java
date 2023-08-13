class Employee3 {
    // properties of class
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;

    }
}
    class Square2{
        int side2;
        public int area(){
            return side2*side2;
        }
        public int perimeter(){
        return 4*side2;
        }
    }
    class Ractangle{
      int Length ;
      int bright ;
      public int area(){
          return Length*bright;
      }
      public int perimeter(){
          return Length+bright+Length+bright;
      }
    }
    class TommyVeceti{
    public void hit(){
        System.out.println("Hitting on sinu");
    }
    public void run(){

        System.out.println("runting on sinu");
        }
     public void fire() {
        System.out.println("firing on sinu");

     }
    }
    class Circle {
    int radius;
    double pi = 3.14 ;

    public double area(){
        return pi*radius*radius ;
    }
    public double perimeter(){
        return 2*pi*radius;
    }
    }

public class practiceSet {
    public static void main(String[] args) {
        // problem -- 1

    /*  Employee3 ravi = new Employee3();
        ravi.setName("ravi malviya");
        ravi.salary = 30000;
        System.out.println(ravi.getName());
        System.out.println(ravi.getSalary());   */

        //    problem -- 3

/*        Square2 sq = new Square2();
        sq.side2 = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());      */

        // problem -- 4
/*
        Ractangle rc = new Ractangle();
        rc.bright = 2;
        rc.Length = 4;

        System.out.println(rc.area());
        System.out.println(rc.perimeter());
*/

    //    problem --  3

    /*    TommyVeceti T = new TommyVeceti();
        T.run();
        T.hit();
        T.fire();     */

    // problem -- 4

    Circle ci = new Circle();
    ci.radius = 2 ;
    System.out.println(ci.area());
    System.out.println(ci.perimeter());



    }
}