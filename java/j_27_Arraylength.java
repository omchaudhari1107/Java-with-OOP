public class j_27_Arraylength {
    public static void main(String[] args) {
        
        String[] student = { "om", "hardik", "parth" };
        System.out.println(student.length);
        
        for (int i = student.length - 1; i >= 0; i--) {
            System.out.println(student[i]);
        }
        
        // for each loop in new version
        int[] marks = { 1, 2, 3, 4, 5, 6 };
        System.out.println(marks.length);
        for (int ele : marks) {
            System.out.print(ele + "\t");
        }
    }
}
