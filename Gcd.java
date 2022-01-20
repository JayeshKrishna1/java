import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int half = number/2;
        int sum = 0;
        for(int i =1;i<=half;i++){
            if(number%i == 0){
                sum += i;
                //System.out.print(i+" ");
            }
        }
        sum += number;
        System.out.println("the sum of facotrs is"+sum);
        if(sum%number == 0)
        System.out.println(sum+" is divisible by "+number);
        else
        System.out.println(sum+" is not divisible by "+number);
        //System.out.print(number);
    }
    
}
