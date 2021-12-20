import java.util.Scanner;

public class Rowsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row and column size of matrix");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int[] res = new int[r];
        for (int i = 0; i < r; i++) {
            int sum = 0;
            for (int j = 0; j < c; j++) {
                sum += matrix[i][j];
            }
            res[i] = sum;
        }
        for (int i = 0; i < r; i++)
            System.out.print(res[i] + " ");
        int count = 0;
        for (int i = 0; i < r - 1; i++) {
            if (res[i] != res[i + 1]) {
                count++;
            }

        }
        if (count == 0)
            System.out.println("true");
        else
            System.out.println("false");

    }

}
