import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int power = sc.nextInt();
        Power obj = new Power();
        obj.powerWithoutRecursion(number,power);
        int result = obj.powerWithRecursion(number,power);
        System.out.println(result);
    }
    static void powerWithoutRecursion(int n,int p){
        int multiply=1;
        for(int i=0;i<p;i++){
            multiply *=n;
        }
        System.out.println(multiply);
    }
    static int powerWithRecursion(int n,int p){
        if(p==0){
            return 1;
        }
        return n*powerWithRecursion(n, p-1);

    }
    
}
