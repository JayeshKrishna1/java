import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int number = sc.nextInt();
        int flag = 0;
        if (number == 0 && number == 1)
            System.out.println(number + " is not a prime number");
        else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    flag = 1;
                }

            }
        }
        if (flag == 0) {
            System.out.println(number + " is a prime");
        } else {
            System.out.println(number + " is not a prime");
        }
    }

}
