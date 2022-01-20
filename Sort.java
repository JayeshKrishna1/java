import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp, i, flag;
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < n - 1; j++) {
            flag = 0;
            for (i = 0; i < n - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                System.out.println("the array is sorted\n");
                break;
            }

        }
        System.out.println("the sorted array is \n");
        for (i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println("the median element is ");
        System.out.println(arr[(0 + n) / 2]);
        int diff = arr[1] - arr[0];
        for (int j = 1; j < n - 1; j++) {
            if (diff > arr[j + 1] - arr[j]) {
                diff = arr[j + 1] - arr[j];
            }
        }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
        System.out.println("the element pairs with minimum difference is");
        for (int k = 0; k < n - 1; k++) {
            if (diff == arr[k + 1] - arr[k]) {
                System.out.println(arr[k] + " " + arr[k + 1]);
                break;
            }
        }
    }

}
