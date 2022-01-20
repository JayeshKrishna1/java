import java.util.Scanner;

public class CheckingSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = arr[0];
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i + 1];
            if (num == sum) {
                System.out.println("the sum is present at " + (i + 1));
                break;
            }
        }
    }
}
