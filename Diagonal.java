import java.util.Scanner;

public class Diagonal {
    public static void main(String args[]) {
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
                if (i == j) {     // for anti diagonal ====> if((i+j) = = (n-1))
                    System.out.println(matrix[i][j]);
                }
            }
        }

    }

}