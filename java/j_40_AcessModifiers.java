class MyEmp {
    private int id;
    private String name;

    public void SetDetail(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void printDetail(){
        System.out.println("Employee name is "+name+" With id: "+id);
    }
}

public class j_40_AcessModifiers {
    public static void main(String[] args) {
        MyEmp e1 = new MyEmp();
        // Acesseing an Attribute with private Declaration is not possible this the
        // bellow shown is illegal
        // We can Acess it with a method(function) of that class
        // e1.id = 12;(illegal)
        // e1.name= "om";(illegal)

        e1.SetDetail(1, "om");
        e1.printDetail();
    }
}