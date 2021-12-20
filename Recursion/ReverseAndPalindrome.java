package Recursion;
import java.util.Scanner;
public class ReverseAndPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int rev =  reverse(num,0);
        if(num == rev){
            System.out.println(num+" is a palindrome");
        }
        else{
            System.out.println(num+" is not a palindrome");
        }
    }
    public static int reverse(int num,int temp){
        if(num == 0){
            return temp;
        }
        else{
        int rem = num%10;
        temp = temp*10 +  rem;
        return reverse(num/10,temp);
        }

    }   
}
