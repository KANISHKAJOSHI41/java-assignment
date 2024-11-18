public class QUEUES {
    private int maxSize;  
    private int front;   
    private int rear;
    private int[] queue;  

    public  QUEUES(int size) {
        maxSize = size;
        queue = new int[maxSize];
        front = -1;
        rear = -1;
    }

    
    public void enqueue(int value) {
        if (rear == maxSize - 1) {
            System.out.println("Queue overflow! Cannot enqueue " + value);
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            queue[rear] = value;
            System.out.println("Enqueued " + value + " to the queue.");
        }
    }

    public int dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue underflow! The queue is empty.");
            return -1;  // Indicating the queue is empty
        } else {
            int dequeuedValue = queue[front];
            front++;
            System.out.println("Dequeued " + dequeuedValue + " from the queue.");
            return dequeuedValue;
        }
    }

    
    public int peek() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty.");
            return -1;  
        } else {
            return queue[front];
        }
    }

    public boolean isEmpty() {
        return front == -1 || front > rear;
    }

    public boolean isFull() {
        return rear == maxSize - 1;
    }

    public void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        QUEUES queue = new  QUEUES(5); 

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60); 
        
      
        queue.display();
       
        System.out.println("Front element: " + queue.peek());
        
    
        queue.dequeue();
        queue.dequeue();
        
   
        queue.display();
        
    
        System.out.println("Is queue empty? " + queue.isEmpty());
        
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}

