class Employee {               //public without access modifire
    int id;
    String name;
    int salary;

    public void printDetails() {
        System.out.println("My id is " + id);
        System.out.println("and my name is " + name);
    }
        public int getSalary(){
            return salary;
        }
    }
    public class Oops_custom_class {
        public static void main(String[] args) {
            System.out.println("This is our custom class");
            Employee ravi = new Employee();//  Instantiating a new Employee Object
            Employee sonu = new Employee();
            // Setting Attributes for ravi
            ravi.id = 12;
            ravi.name = "malviya";
            ravi.salary = 30;

            // Setting the Attributes for sonu
            sonu.id = 13;
            sonu.name = "sonu malviya";
            sonu.salary = 20;

            // Printing the Attributes

             // System.out.println(ravi.id);
            // System.out.println(ravi.name);

            ravi.printDetails();
            sonu.printDetails();
            int salary = ravi.getSalary();
            System.out.println(salary);
        }
    }