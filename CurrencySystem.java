import java.util.Scanner;

// currency denominatiom
public class CurrencySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the testcase");
        int testcase = sc.nextInt();
        CurrencySystem obj = new CurrencySystem();
        while (testcase > 0) {
            System.out.println("Enter the rupees");
            int rupees = sc.nextInt();
            obj.currencyDenomination(rupees);
            testcase--;
        }
    }

    public static void currencyDenomination(int r) {
        int rem = 0;
        if (r % 100 == 0 || r > 100) {
            rem += r / 100;
            r = r % 100;
        }
        if (r % 50 == 0 || r > 50) {
            rem += r / 50;
            r = r % 50;

        }
        if (r % 10 == 0 || r > 10) {
            rem += r / 10;
            r = r % 10;
        }
        if (r % 5 == 0 || r > 5) {
            rem += r / 5;
            r = r % 5;
        }
        if (r % 2 == 0 || r > 2) {
            rem += r / 2;
            r = r % 2;
        }
        if (r % 1 == 0 || r > 1) {
            rem += r / 1;
            r = r % 1;
        }
        System.out.println(rem);

    }

}
