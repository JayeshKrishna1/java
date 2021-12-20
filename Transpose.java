import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("enter the array elements");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print(matrix[j][i] + " ");
            }
            System.out.println("");
        }
    }

}
