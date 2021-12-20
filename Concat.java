import java.util.Scanner;

public class Concat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1st string");
        String name1 = sc.nextLine();
        System.out.println("enter the 2nd string");
        String name2 = sc.nextLine();
        String name3 = name1.concat(name2);
        System.out.println("the concated string is " + name3);

    }

}
