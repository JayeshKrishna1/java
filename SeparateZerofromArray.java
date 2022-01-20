import java.util.Scanner;

public class SeparateZerofromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int n = sc.nextInt();
        System.out.println("enter the array elements");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int count = 0;
            if(arr[i] == 0){
                count++;
            }
            else{
                System.out.println(arr[i]);
            }
        }

    }
    
}
