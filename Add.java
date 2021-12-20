import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number ");
        long n = sc.nextLong();
        long i = 1;
        long a = 0;
        System.out.print("the sum of n natural numbers are ");
        while (i <= n) {
            a += i;
            i++;
        }
        System.out.println(a + " ");
    }

}
