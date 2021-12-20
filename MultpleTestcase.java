import java.util.*;

public class MultpleTestcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of testcase");
        int testcase = sc.nextInt();

        while (testcase > 0) {
            System.out.println("enter the number of words");
            int word = sc.nextInt();
            String arr[] = new String[word];
            for (int i = 0; i < word; i++) {
                arr[i] = sc.next();
            }
            Arrays.sort(arr);
            System.out.print(arr[0] + " " + arr[arr.length - 1]);
            System.out.println("");
            testcase--;

        }
    }

}
