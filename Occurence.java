import java.util.*;

public class Occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s[] = sc.nextLine().split(" ");
        System.out.println(Arrays.toString(s));
        String s1[] = sc.nextLine().split(" ");
        System.out.println(Arrays.toString(s1));
        for(int i = 0;i< s1.length;i++){
            int count = 0;
            for(int j = 0;j< s.length;j++){
                if(s1[i].equals(s[j])){
                    count++;
                }
            }
            System.out.print(count+" ");
        }
    }
}
