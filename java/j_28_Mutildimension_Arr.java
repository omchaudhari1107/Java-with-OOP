/**
 * j_28_Mutildimension_Arr
 */
public class j_28_Mutildimension_Arr {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        // int arr[row][column];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
               System.out.print(arr[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
}