class MymainEmployee {
private int id;
private String name;

public MymainEmployee(){       // constructors
    id = 44;
    name = "ravi malviya";
}
    public MymainEmployee(String myName){       // constructors

        name = myName;
    }
public MymainEmployee(String myName, int myId){       // constructors
    id = myId;
    name = myName;
}


    public String geTName() {
        return name;
 }
public void seTName(String n) {
        this.name = n;
 }
public void seTId(int i) {
        this.id = i;
}
public int geTId() {
        return id;
}
}
public class Unit_9_constructors {
    public static void main(String[] args) {
        MymainEmployee ravi = new MymainEmployee();
    //    MymainEmployee ravi = new MymainEmployee("royking");
    //    MymainEmployee ravi = new MymainEmployee("Rvhacker",123);
    /*    ravi.seTName("ravi");
        ravi.seTId(45);
        System.out.println(ravi.geTName());
        System.out.println(ravi.geTId());   */
        System.out.println(ravi.geTId());
        System.out.println(ravi.geTName());

    }
}
