import java.util.*;
import java.lang.Math;

public class Root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double root = (b * b) - (4 * a * c);
        if (root > 0) {
            double root1 = (-b + Math.sqrt(root)) / 2 * a;
            double root2 = (-b - Math.sqrt(root)) / 2 * a;
            System.out.println(root1);
            System.out.println(root2);
        } else if (root == 0) {
            double root1 = -b / 2 * a;
            double root2 = -b / 2 * a;
            System.out.println(root1);
            System.out.println(root2);
        } else {
            System.out.println("imaginary value will occur");
        }
    }

}
