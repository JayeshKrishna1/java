import java.util.Scanner;

public class BookRegistertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str[] = new String[n];
        for(int i=0;i<n;i++){
            str[i] = sc.next();
        }
        System.out.println("OK");
        for(int i=0;i<n-1;i++){
            if(str[i].equals(str[i+1])){
                System.out.println(str[i]+""+(i+1));
            }
            else{
                System.out.println("OK");
            }
        }
    }
    
}
