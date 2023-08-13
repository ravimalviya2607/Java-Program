class MyEmployee {
    private int id;
    private String name;

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

public class Unit_9_Accessmodifiers {
    public static void main(String[] args) {

        MyEmployee ravi = new MyEmployee();
    //    ravi.id = 45;
    //    ravi.name = "ravimalviya"; --> throws an error due to private access modifier

        ravi.seTName("ravimalviya");
        ravi.seTId(23);
        System.out.println(ravi.geTName());
        System.out.println(ravi.geTId());





    }
}
