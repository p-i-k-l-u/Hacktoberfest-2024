class StackUsingArray {
    private int[] stack;
    private int top;
    private int capacity;
    
    // Constructor to initialize the stack
    public StackUsingArray(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }
    
    // Push an element onto the stack
    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        System.out.println("Inserting " + x);
        stack[++top] = x;
    }
    
    // Pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        System.out.println("Removing " + stack[top]);
        return stack[top--];
    }
    
    // Peek at the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }
    
    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }
    
    // Check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }
    
    // Get the size of the stack
    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(5);
        
        stack.push(1);  // Insert 1
        stack.push(2);  // Insert 2
        stack.push(3);  // Insert 3
        stack.push(4);  // Insert 4
        stack.push(5);  // Insert 5
        stack.push(6);  // Attempt to insert 6 (will cause overflow)

        System.out.println("Top element is " + stack.peek());  // Peek at the top element
        
        stack.pop();    // Remove the top element (5)
        stack.pop();    // Remove the top element (4)

        System.out.println("Size of stack is " + stack.size());  // Get current size
    }
}
