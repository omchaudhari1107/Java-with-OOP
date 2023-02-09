class Employee {
    int id;
    String name;

    // define a constructor:A memeber function use to intitalize an object while
    // creating it
    public Employee(int a, String b) {
        // this constructor is called parameterized constructor
        id = a;
        name = b;
    }

    public Employee() {
        id = 0;
        name = "Not an employee";
    }

    public void printDetail() {
        System.out.println("id is " + id);
        System.out.println("name is " + name);
    }
}

public class j_42_Constructor {
    public static void main(String[] args) {

        System.out.println("Our custom class");
        Employee E1 = new Employee(1, "om");// Creating a new Employee object
        Employee E2 = new Employee(2, "Hardik");// Creating a new Employee object
        Employee E3 = new Employee();// Creating a new Employee object(not pasing a values)

        E1.printDetail();
        E2.printDetail();
        E3.printDetail();// this is called constructor Overloading
    }
}
