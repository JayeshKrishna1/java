import java.util.Scanner;

public class StringMultiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of testcases");
        int testcase = sc.nextInt();
        while (testcase > 0) {
            System.out.println("enter the number of elements");
            int number = sc.nextInt();
            String[] arr = new String[number];
            for (int i = 0; i < number; i++) {
                arr[i] = sc.next();
            }
            int[] arr1 = new int[arr.length];
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = arr[i].charAt(i);
                arr1[i] = Integer.parseInt(arr[i]);
            }
            int sum = 0;
            for (int i = 0; i < arr1.length; i++) {
                sum += arr1[i];
            }
            System.out.println(sum);
            testcase--;
        }
        sc.close();
    }

}
