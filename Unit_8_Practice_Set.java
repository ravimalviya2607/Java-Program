 class Employee2{
    int salary;
    String name;


    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
 }
 class CellPhone2{
    public void ring() {
        System.out.println("Ringing....");
    }
     public void vibrate() {
         System.out.println("vibrating....");
     }
     public void callFriend(){
         System.out.println("calling Sinu....");
    }
 }
 class Square{
    int side ;
    public int area() {
        return side * side;
    }
    public int perimeter(){
        return 4 * side ;
    }
 }
 class Tommy{
    public void Hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
 }
public class Unit_8_Practice_Set
{
    public static void main(String[] args) {
        // Problem -- 1
    /*
        Employee2 ravi = new Employee2();
        ravi.setName("Rv hacker");
        ravi.salary = 300;
        System.out.println(ravi.getSalary());
        System.out.println(ravi.getName());  */

    //     Problem -- 2

        CellPhone2 iphone = new CellPhone2();
        iphone.ring();
        iphone.vibrate();
        iphone.callFriend();


        // Problem -- 3

/*        Square sq = new Square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

       // Problem -- 5
       Tommy player1 = new Tommy();
        player1.fire();
        player1.run();
        player1.Hit();
*/

    }
}
