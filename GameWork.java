import java.util.Scanner;

public class GameWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter a number");
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum % number != 0) {
                System.out.print(arr[i]+" ");
                }
                else{
                    sum = sum - arr[i];
                }
            }
    }
}
