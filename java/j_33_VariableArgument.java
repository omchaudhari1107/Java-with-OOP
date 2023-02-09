public class j_33_VariableArgument {
    // static int sum(int a, int b) {
    //     return a + b;
    // }
    // static int sum(int a,int b,int c){
    //     return a+b+c;
    // }
    // static int sum(int a,int b,int c,int d){
    //     return a+b+c+d;
    // }
    //insted of this we use varargs

    public static int sum(int ...arr){
        //Available as int[] arr;
        int add=0;
        for (int i : arr) {
            add+=i;
        }
        return add;
    }

    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));
        System.out.println(sum(1,2,3,4));
        //for solving this type of increaseing argument problem then we use varArgs..
    }
}
