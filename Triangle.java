import java.util.Arrays;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s[] = sc.nextLine().split(" ");
        System.out.println(Arrays.toString(s));
        int arr[] = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        if (arr.length <= 3) {
            if (arr[0] != 0 && arr[1] != 0 && arr[2] != 0) {
                if (arr[0] + arr[1] + arr[2] == 180) {
                    System.out.println("triangle is valid");
                } else
                    System.out.println("triangle is not valid");

            } else
                System.out.println("triangle is not valid");

        } else
            System.out.println("triangle is not valid");

    }

}
