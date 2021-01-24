package queue;

public class QueueExample {

    int front, rear, size;
    int capacity;
    int array[];

    public static void main(String[] args) {
        QueueExample queue = new QueueExample(1000);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println(queue.dequeue() + " dequeued from queue");

        System.out.println("Front item is " + queue.getFront());

        System.out.println("Rear item is " + queue.getRear());
    }

    public QueueExample(int capacity) {
        this.front = 0;
        this.rear = capacity-1;
        this.size = 0;
        this.capacity = capacity;
        this.array = new int[capacity];
    }

    public boolean isFull(){
        return size==capacity;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void enqueue(int item){
        if(isFull()){
            return;
        }
        rear=(rear+1)%capacity;
        array[rear]=item;
        size=size+1;
        System.out.println("item is enqueue");
    }

    public int dequeue(){
        if(isEmpty()){
            return Integer.MIN_VALUE;
        }
        int item =array[front];
        front=(front+1)%capacity;
        size=size-1;
        return item;
    }

    public int getFront(){
        return array[front];
    }

    public int getRear(){
        return array[rear];
    }
}
