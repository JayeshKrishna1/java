import java.util.Scanner;

public class ArithmeticSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        ArithmeticSeries obj = new ArithmeticSeries();
        int result =obj.seriesWithRecursion(number);
        System.out.println(result);
        obj.seriesWithoutRecursion(number);
    }
    public static int seriesWithRecursion(int n){
        if(n==0){
            return 0;
        }
        return n + seriesWithRecursion(n-1);
    }
    public static void seriesWithoutRecursion(int n){
        int sum = 0;
        for(int i=0;i<=n;i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
    
}
