import java.util.Scanner;

class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; 

    boolean isEmpty() {
        return (top < 0);
    }

    Stack() {
        top = -1;
    }

    void push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            
        } else {
            a[++top] = x;
            System.out.print(x + " ");
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top--];
            return x;
        }
    }

    int peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top];
            return x;
        }
    }

    void print() {
        for (int i = top; i > -1; i--) {
            System.out.print(" " + a[i]);
        }
    }
}


class Main {
    public static void main(String args[]) {
        Stack s = new Stack();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            s.push(arr[i]);
        }
    }
}
