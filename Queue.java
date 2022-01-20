import java.util.Scanner;

public class Queue {
    int front;
    int rear;
    static int size = 5;
    int [] queue = new int[size];
    Queue(){
        front = -1;
        rear = -1;

    }
    public static void main(String[] args) {
        Queue que = new Queue();
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<size;i++){
            int value = sc.nextInt();
            que.enqueue(value);
        }
        que.print();
    }
    void enqueue(int a){
        if(front == 0 && rear == size-1){
            System.out.println("queue full");
        }
        else if(front == -1){
            front = 0;
        }
        rear++;
        queue[rear] = a;
    }
    void dequeue(){
        if(front == -1 && rear == -1 ){
            System.out.println("queue empty");
        }
        System.out.println("the dequeued element is"+queue[front]);
        front++;
    }
    void print(){
        for(int i= size-1;i>=0;i--){
            System.out.print(queue[i]+" ");
        }
    }
    
}
