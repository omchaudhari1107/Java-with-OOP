class Employee{
    int Salary;
    String name;

    public void SetName(String a){
        name=a;
    }

    public int GetSalary(int a){
        Salary = a;
        return Salary;
    }
    public String GetName(){
        return name;
    }
}
public class ps_chapter8 {
   public static void main(String[] args) {
    Employee om = new Employee();
    int Salary = om.GetSalary(10000);
    om.SetName("om");
    String name = om.GetName();
    System.out.println("Employee name is "+ name +" having a Salary of "+Salary);
   } 
}
