class phone {
    public void greet() {
        System.out.println("Good Morning");
    }

    public void name() {
        System.out.println("My name is Java");
    }
}

class Smartphone extends phone {
    @Override
    public void name() {
        System.out.println("My name is Java in class two");
    }
    
    public void welcome() {
        System.out.println("Welcome");
    }
}

public class j_49_DynamicMethodDispatch {
    public static void main(String[] args) {
        phone obj = new Smartphone();
       //      ^           ^
       //      |           |
       //   refrence     object 
       
       obj.greet();

       obj.name();






       //obj.welcome();//Not allowed because the reference is of phone(parent class) and object is created of new Smartphone 

       //conculusion: it runs all the method of parent class and also runs the method's of child class which is Overriding in both class  [phone(parent class) obj(Refrence) = new Smartphone()(object)] 
       //means refrence of phone(parent class) and create an object of Smartphone(child class) thus it's vice versa is not allowed...
    }
}
