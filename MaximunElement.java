import java.util.Scanner;

public class MaximunElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of testcases");
        int testcase = sc.nextInt();
        while (testcase > 0) {
            System.out.println("enter the number");
            int number = sc.nextInt();
            int[] arr = new int[number];
            for (int i = 0; i < number; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i + 1] < arr[i]) {
                    System.out.println("the maximum element in bitonic array is " + arr[i]);
                    break;
                }
            }
            testcase = testcase - 1;
        }
    }

}
