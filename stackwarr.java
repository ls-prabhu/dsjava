import java.util.*;

public class stackwarr {
    private int max;
    private int[] st;
    private int top;

    public stackwarr(int size) {
        max = size;
        st = new int[max];
        top = -1;
    }

    // Method to push an element onto the stack
    public void push(int value) {
        if (top == max - 1) {
            System.out.println("Stack overflow");
            return;
        }
        st[++top] = value;
        System.out.println(value + " pushed into the stack");
    }

    // Method to pop an element from the stack
    public int pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return -1;
        }
        int popElement = st[top--];
        System.out.println(popElement + " popped from the stack");
        return popElement;
    }

    // Method to peek the top element of the stack
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return st[top];
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    public void display() {
        System.out.println("Printing stack elements .....");
        for (int i = top; i >= 0; i--) {
            System.out.println(st[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = scanner.nextInt();
        stackwarr stack = new stackwarr(n);

        while (true) {
            System.out.println("1. PUSH");
            System.out.println("2. POP");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push into the stack: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    System.out.println("Is stack empty? " + stack.isEmpty());
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
