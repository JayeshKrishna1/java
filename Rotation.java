import java.util.Scanner;

public class Rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String str = sc.nextLine();
        System.out.println("type '1' for leftrotation and '2' for right rotation and '3' for rotationcheck");
        int choice = sc.nextInt();
        Rotation obj = new Rotation();
        switch (choice) {
            case 1:
                obj.leftRotation(str);
                break;
            case 2:
                obj.rightRotation(str);
                break;
            case 3:
                obj.rotationCheck(str);
                break;
            default:
                System.out.println("wrong choice");
                break;
        }
    }

    /*
     * subString(beginindex) ===> including the begin index.
     * subString(beginindex,endindex) ===> including begin index and excluding
     * the end index
     */
    public static void leftRotation(String str) {
        // 3
        // 1 2 3 4 5
        // left rotation = 4 5 1 2 3
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rotation value");
        int r = sc.nextInt();
        String ans = str.substring(r) + str.substring(0, r);
        System.out.println("the left rotated string is " + ans);
    }

    public static void rightRotation(String str) {
        // 3
        // 1 2 3 4 5
        // right rotation = 3 4 5 1 2
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rotation value");
        int r = sc.nextInt();
        int n = str.length();
        String ans = str.substring(n - r) + str.substring(0, n - r);
        System.out.println("the right rotated string is " + ans);
    }

    public static void rotationCheck(String str) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string to be checked");
        String str1 = sc.nextLine();
        String str2 = str.concat(str);
        if (str2.contains(str1)) {
            System.out.println(str1 + " is a rotation of " + str);
        } else {
            System.out.println(str1 + " is not a rotation of " + str);
        }
    }

}
