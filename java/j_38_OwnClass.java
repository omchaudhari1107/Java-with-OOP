//in a single java file there is only one public or private class
class Employee {
    int id;
    String name;

    public void SetDetail(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void printDetail() {
        System.out.println("id is " + id);
        System.out.println("name is " + name);
    }
}

public class j_38_OwnClass {
    public static void main(String[] args) {
        System.out.println("Our custom class");
        Employee om = new Employee();// Creating a new Employee object
        Employee hardik = new Employee();// Creating a new Employee object

        om.SetDetail(1, "om");
        hardik.SetDetail(2, "Hardik");

        om.printDetail();
        hardik.printDetail();
    }
}
