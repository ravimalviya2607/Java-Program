class C1{
    public int x = 70;
    protected int y = 45;
    int z  = 20;
    private int v = 50;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(v);
    }
}
    public class Unit_12_AccessModifier {
    public static void main(String[] args) {

        C1 c = new C1();
        c.meth1();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
    //    System.out.println(c.v);
    }
}
