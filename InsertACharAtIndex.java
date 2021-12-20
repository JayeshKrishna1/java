import java.util.Scanner;

public class InsertACharAtIndex {
    public static void main(String[] args) {
        System.out.println("enter the index");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        System.out.println("enter the string");
        String name = sc.nextLine();
        System.out.println("original string " + name);
        System.out.println("the character at asked position is" + name.charAt(index));
        sc.close();
    }

}
