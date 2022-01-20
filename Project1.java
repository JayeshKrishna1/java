import java.util.Arrays;
import java.util.Scanner;

import org.w3c.dom.ls.LSException;

public class Project1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String str1 = sc.nextLine();
        // if(word.length() > 7){
        // int mid = word.length()/2;
        // System.out.println(word.substring(mid-1, mid+2));
        // }
        // char[] ans = new char[str1.length()];
        // int k =0;
        // int length_of_str1 = str1.length();
        // for(int i = 0;i<length_of_str1;i++){
        // if(str1.charAt(i) >= 'a' && str1.charAt(i) <='z'){
        // ans[k++] = str1.charAt(i);

        // }
        // }
        // for(int i = 0;i<length_of_str1;i++){
        // if(str1.charAt(i) >= 'A' && str1.charAt(i) <='Z'){
        // ans[k++] = str1.charAt(i);

        // }
        // }
        // for(int i = 0;i<str1.length();i++){
        // System.out.print(ans[i]+" ");
        // }
        // }
        // int n = sc.nextInt();
        // String[] str1 = new String[n];
        // String[] str2 = new String[n];
        // sc.nextLine();
        // for (int i = 0; i < n; i++) {
        // str1[i] = sc.nextLine();
        // }
        // for (int i = 0; i < n; i++) {
        // str2[i] = sc.nextLine();
        // }
        // for (int i = 0; i < n; i++) {
        // System.out.print(str1[i] + str2[i]+" ");
        // }
        // System.out.println(Arrays.toString(str1));
        // String n = sc.nextLine();
        // if(isPlaindrome(n)){
        // System.out.println(n.length());
        // }
        // else{

        // }

        // }
        // static boolean isPalindrome(int n){
        // String n1 = new String();

        // int n = sc.nextInt();

        // int m = sc.nextInt();
        // sc.nextLine();
        // String[] str1 = new String[n];
        // String[] str2 = new String[m];
        // for (int i = 0; i < n; i++) {
        // str1[i] = sc.nextLine();
        // }

        // for (int i = 0; i < m; i++) {
        // str2[i] = sc.nextLine();
        // }
        // int flag = 0;
        // System.out.println(Arrays.toString(str1));
        // System.out.println(Arrays.toString(str2));
        // int sum = Integer.parseInt(str1[0]) + Integer.parseInt(str2[0]);
        // for (int i = 1; i < n; i++) {
        // if (sum != Integer.parseInt(str1[i]) + Integer.parseInt(str2[i])) {
        // flag = 1;
        // break;
        // }
        // }
        // if (flag == 0) {
        // System.out.println("true");
        // } else {
        // System.out.println("false");
        // }
        // int n = sc.nextInt();
        // int m = sc.nextInt();
        // sc.nextLine();
        // String[] str1 = new String[n];
        // String[] str2 = new String[m];
        // for (int i = 0; i < n; i++) {
        // str1[i] = sc.nextLine();
        // }

        // for (int i = 0; i < m; i++) {
        // str2[i] = sc.nextLine();
        // }
        // int count = 0;
        // for (int i = 0; i < n; i++) {
        // int flag = 0;
        // for (int j = 0; j < m; j++) {
        // if (str1[i] == str2[j]) {
        // flag = 1;
        // }
        // }
        // if (flag == 0) {
        // count += 1;
        // }
        // }
        // for (int j = 0; j < m; j++) {
        // int flag = 0;
        // for (int i = 0; i < n; i++) {
        // if (str1[j] == str2[i]) {
        // flag = 1;
        // }
        // }
        // if (flag == 0) {
        // count += 1;
        // }
        // }
        // System.out.println(count);

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // int value1 = a % 10;
        // int value2 = b % 10;
        // int multiply = value1 * value2;
        // if (multiply == c % 10)
        //     System.out.println(true);
        // else
        //     System.out.println(false);
        String number = sc.nextLine();
        int length = number.length();
        String ans = new String();
        for(int i = 0;i< length;i++){
            String temp = Character.toString(number.charAt(i));
            if(!ans.contains(number) && temp.contains(number)){
                ans = temp;
            }
        }
        String numbers = "0123456789"; 
        if(ans.contains(number) && ans.contains(numbers)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}