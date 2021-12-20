import java.util.Scanner;

public class Unicode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String name = sc.nextLine();
        System.out.println("enter the index");
        int index = sc.nextInt();
        int l = name.charAt(index); // widening typecast
        System.out.println("the unicode is" + l);
        // for narrowing typecast
        // sysout("the unicode is"+(int)name.charAt(index));
    }

}
