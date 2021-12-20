import java.util.Scanner;

public class LexicographicalCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1st string");
        String name1 = sc.nextLine();
        System.out.println("enter the 2nd string");
        String name2 = sc.nextLine();
        name1 = name1.toUpperCase(); //to ignore case
        name2 = name2.toUpperCase(); //to ignore case
        int res = name1.compareTo(name2);
        if (res < 0) {
            System.out.println(name1 + " is less than " + name2);
        } else if (res > 0) {
            System.out.println(name1 + " is greater than " + name2);
        } else {
            System.out.println(name1 + " is equal to " + name2);
        }

    }

}
