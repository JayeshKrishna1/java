package functions;

import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int first = sc.nextInt();
        //int second = sc.nextInt();
        //int third = sc.nextInt();
        var findaverage = new Average();
        //System.out.println(findaverage.average(first, second, third));
        //System.out.println(findaverage.smallest(first, second,third ));
        String name = new String();
        name = sc.nextLine();
        System.out.println(findaverage.middleCharacter(name));
    }
    public char middleCharacter(String name){
        int length = name.length();
        int mid = length/2;
        return name.charAt(mid);
    } 
    public int smallest(int a,int b,int c){
        if(a < b){
            if(a < c){
                return a;
            }
            else{
                return c;
            }
        }
        else{
            return b;
        }
    }
        public int average(int a, int b, int c) {
            return (a + b + c);
        }
  
}
