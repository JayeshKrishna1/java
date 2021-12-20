import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        Fibonacci obj = new Fibonacci();
        obj.fibonacci(n);
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(fibo(i)+" ");
        }
    }

    static int fibo(int i) {
        if (i == 0)
            return 0;
        else if (i == 1)
            return 1;
        else
            return (fibo(i - 1) + fibo(i - 2));

    }

    static void fibonacci(int n) {
        int n1 = 0, n2 = 1;
        System.out.print(n1 + " " + n2 + " ");
        for (int i = 0; i < n - 2; i++) {
            int n3;
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }

    }

}
