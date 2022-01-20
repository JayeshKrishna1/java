import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int number = sc.nextInt();
        SpyNumber obj = new SpyNumber();
        obj.spynum(number);
        obj.buzznum(number);
    }
    public static void buzznum(int n){
        if(n%7 == 0 || n/10 == 7){
            System.out.println(" the given number is buzz number");
        }
        else{
            System.out.println("the given number is not a buzz number");
        }
    }
    public static void spynum(int n) {
        int temp = n;
        int sum = 0;
        int multiply = 1;
        while (temp > 0) {
            sum += temp % 10;
            multiply *= temp % 10;
            temp = temp / 10;
        }
        if (sum == multiply) {
            System.out.println(n + " is a spy number");
        } else {
            System.out.println(n + " is not a spy number");
        }

    }

}
