public class Variable_Argument {
 /* static int sum(int a , int b){
      return a+b;
  }
      static int sum(int a , int b, int c){
          return a+b+c;
  }
  static int sum(int a , int b, int c, int d){
      return a+b+c+d;
  }    */
    // static int sum(int x int...arr){
      static int sum(int...arr){
     // Available as int arr [] ;
     // In this case at list 1 argument is important
      int result=0;
     // int result = x;
     for(int i=0;i<arr.length;i++){
         result += arr[i];
     }
     return result;
    }
    public static void main(String[] args) {
        System.out.println("welcom to vararg");
        System.out.println("The sum of this value is : " +sum()); // In this varargs in sum is empty so this is return value is zero
        System.out.println("The sum of this value is : " +sum(1,2, 3));
        System.out.println("The sum of this value is : " +sum(2, 3, 4, 4, 10, 20));
        System.out.println("The sum of this value is : " +sum(1));
    }
}
