import java.util.Arrays;
import java.util.Scanner;

public class Splitline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s[] = sc.nextLine().split(" ");
        System.out.println(Arrays.toString(s));
        int arr[] = new int[s.length];
        for (int i = 0; i < s.length; i++)
            arr[i] = Integer.parseInt(s[i]);
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        System.out.println(max);

    }

}
