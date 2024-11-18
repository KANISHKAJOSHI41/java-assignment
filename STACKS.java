public class STACKS {
    private int maxSize;  
    private int top;      
    private int[] stack; 
    
    public STACKS(int size) {
        maxSize = size;
        stack = new int[maxSize];
        top = -1; 
    }
    
    public void push(int value) {
        if (top < maxSize - 1) {
            stack[++top] = value;  
            System.out.println("Pushed " + value + " to stack");
        } else {
            System.out.println("Stack overflow! Cannot push " + value);
        }
    }
    
    
    public int pop() {
        if (top >= 0) {
            int poppedValue = stack[top--]; 
            System.out.println("Popped " + poppedValue + " from stack");
            return poppedValue;
        } else {
            System.out.println("Stack underflow! Stack is empty.");
            return -1; 
        }
    }
    
    
    public int peek() {
        if (top >= 0) {
            return stack[top]; 
        } else {
            System.out.println("Stack is empty.");
            return -1;  
        }
    }
    
    public boolean isEmpty() {
        return top == -1;
    }
    
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        STACKS stack = new STACKS(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);  
        
        stack.display();
        
       
        System.out.println("Peeked top element: " + stack.peek());
        
        stack.pop();
        stack.pop();
        
        
        stack.display();
        
      
        System.out.println("Is stack empty? " + stack.isEmpty());
        
        stack.pop();
        stack.pop();
        stack.pop();
        
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
