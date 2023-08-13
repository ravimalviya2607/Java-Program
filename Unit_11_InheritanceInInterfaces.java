interface sampleInterfaces{
    void methh1();
    void methh2();
}
interface childSampleInterfaces extends sampleInterfaces{
    void methh3();
    void methh4();
}
class MySampleClass implements childSampleInterfaces{
    public void methh1(){
        System.out.println("methh1");
    }
    public void methh2(){
        System.out.println("methh2");
    }
    public void methh3(){
        System.out.println("methh3");
    }
    public void methh4(){
        System.out.println("methh4");
    }
}
public class Unit_11_InheritanceInInterfaces {
    public static void main(String[] args) {

        MySampleClass obj = new MySampleClass();
        obj.methh1();
        obj.methh2();
        obj.methh3();
        obj.methh4();
    }
}
