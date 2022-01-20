import java.util.ArrayList;
import java.util.Scanner;

public class OddOccurence {
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<String> ans = new ArrayList<>(100);
        for(int i =0;i<n;i++){
            int count = 0;
            for(int j = 0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count%2 != 0){
                if(!(ans.contains(arr[i]))){
                    ans = arr[i];
                }
                System.out.print(arr[i]+" ");
            }
        }
    }
    
 }
// // Java program to find the element occurring
// // odd number of times
// class OddOccurrence {
	
// 	// function to find the element occurring odd
// 	// number of times
// 	static int getOddOccurrence(int arr[], int arr_size)
// 	{
// 		int i;
// 		for (i = 0; i < arr_size; i++) {
// 			int count = 0;
// 			for (int j = 0; j < arr_size; j++) {
// 				if (arr[i] == arr[j])
// 					count++;
// 			}
// 			if (count % 2 != 0)
// 				return arr[i];
// 		}
// 		return -1;
// 	}
	
// 	// driver code
// 	public static void main(String[] args)
// 	{
// 		int arr[] = new int[]{ 1,1,1, };
// 		int n = arr.length;
// 		System.out.println(getOddOccurrence(arr, n));
// 	}
// }
// // This code has been contributed by Kamal Rawal
