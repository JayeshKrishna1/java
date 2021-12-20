import java.util.Scanner;

public class Matrixadd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
        int n = sc.nextInt();
        int[][] matrix1 = new int[n][n];
        System.out.println("enter the array elements");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        int[][] matrix2 = new int[n][n];
        System.out.println("enter the array elements");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
        int[][] add = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                add[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(add[i][j] + " ");
            }
            System.out.println("");
        }

    }

}
