public class Unit_7_MethodOf {

  //  int logic(int x, int y) {  without static of any variable method
    static int logic(int x, int y) {
     int z;
     if (x > y) {
         z = x + y;
     } else {
         z = (x + y) * 5;
     }
         return z;
     }
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
     //   Unit_7_MethodOf  obj = new Unit_7_MethodOf();  This is the creating a method of object in the class
      //  c = obj.logic(a, b);
        c = logic(a, b);
        System.out.println(a +" "+ b );
    //    c = logic(a, b);
        // 2nd method
        int a1 = 3;
        int b1 = 1;
        int c1;
     //   c1 = obj.logic(a1, b1);     create a object in class
        c1 = logic(a1, b1);
        System.out.println(c);
        System.out.println(c1);

    }
}
