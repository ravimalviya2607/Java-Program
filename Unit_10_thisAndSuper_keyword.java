class EkClass{
    int a;

    public int getA(){
        return a;
    }
    EkClass(int a){       // constructor
        this.a = a;     // This is the reference
    }

    public int returnOne(){
        return 1;
    }
}
class DoClass extends EkClass{
    DoClass(int c){
        super(c);
        System.out.println("me ek constructor hoon");
    }
}
public class Unit_10_thisAndSuper_keyword {
    public static void main(String[] args) {

        EkClass e = new EkClass(35);
        System.out.println(e.getA());
        DoClass d = new DoClass(21);
        System.out.println(d.getA());
    }
}
