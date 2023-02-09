//no object of an abstract class can be created
abstract class Base{

    public Base(){
        System.out.println("Constructor of Base");
    }

    public void sayHello(){
       System.out.println("Hello"); 
    }

    abstract public void greet1();
    abstract public void greet2();
}
class Derived extends Base{

    @Override
    public void greet1(){
    System.out.println("Good morning");
    }

   @Override
   public void greet2(){
    System.out.println("Good afternoon");
   }

}
public class j_53_AbstractClassandMethod {
    public static void main(String[] args) {
        //Base b = new Base(); --not possible because it is abstract class and an abstract class cannot be instantiated(accesed)
        
        Derived d = new Derived();
        d.sayHello();
        d.greet1();
        d.greet2();
            
        // Abstract means that a thing which is just being imagine but not avialable in physical form.
        // in java it means that a method is declared without any implementation.
        // Ex:- abstract void abstractMethod(double x, double y);
        // if a class includes abstract method, then the class itself must be declared as abstract,as in.
        /*
         * Ex:- abstract class Class_Name{
         * abstract void abstractMethod(double x, double y);//a class have abstract
         * method thus it called as abstract class.
         * 
         * }
         */
    }
}
